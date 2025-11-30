package com.sesame.ecommerceproject.Services;

import com.sesame.ecommerceproject.Entities.*;
import com.sesame.ecommerceproject.Repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    ICommandeRepository icommandeRepository;
    @Autowired
    IClientRepository iClientRepository;
    @Autowired
    IPanierRepository iPanierRepository;
    @Autowired
    IPaiementRepository iPaiementRepository;
    @Autowired
    IProduitRepository iProduitRepository;
    @Override
    public Commande checkout(int clientID, String modepaiement){
        Client client = iClientRepository.findById(clientID).get();
        Panier  panier = iPanierRepository.findById(clientID).get();
        if(panier.getLigneCommandes().isEmpty()){
            throw new RuntimeException("Ligne Commandes non valides");
        }
        Commande commande=new Commande();
        commande.setClient( client);
        commande.setDatecommande(LocalDateTime.now());
        commande.setStatuscommande(StatusCommande.En_Attente);
        double total=0;
        for(LigneCommande l1:panier.getLigneCommandes()){
            Produit  produit=iProduitRepository.findById(l1.getProduit().getId()).get();
            if(produit.getStock()<l1.getProduit().getStock()){
                throw new RuntimeException("Stock insuffisant");
            }
            produit.setStock(produit.getStock()-l1.getProduit().getStock());
            iProduitRepository.save(produit);
            LigneCommande l=new LigneCommande();


            l.setProduit(l1.getProduit());
            l.setQuantite(l1.getQuantite());
            l.setPrixunitaire(l1.getPrixunitaire());
            l.setCommande(l1.getCommande());
            commande.getLignesDeCommande().add(l);
            total+=l.getQuantite()*l.getPrixunitaire();
            commande.setTotal(total);


        }
        Paiement  paiement = new Paiement();
        paiement.setCommande(commande);
        paiement.setMontant(total);
        paiement.setModepaiement(modepaiement);
        paiement.setStatuspaiement(StatusPaiement.En_Attente);
        paiement.setDatepaiement(LocalDateTime.now());
        panier.getLigneCommandes().clear();

        iPaiementRepository.save(paiement);
        icommandeRepository.save(commande);
        iPanierRepository.save(panier);
        return commande;

    }
}

package com.sesame.ecommerceproject.ServiceImplementation;

import com.sesame.ecommerceproject.Entities.Client;
import com.sesame.ecommerceproject.Entities.LigneCommande;
import com.sesame.ecommerceproject.Entities.Panier;
import com.sesame.ecommerceproject.Entities.Produit;
import com.sesame.ecommerceproject.Repository.IClientRepository;
import com.sesame.ecommerceproject.Repository.IPanierRepository;
import com.sesame.ecommerceproject.Repository.IProduitRepository;
import com.sesame.ecommerceproject.Services.PanierService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PanierServiceImpl  implements PanierService {
    @Autowired
    IPanierRepository ipanierRepository;
    @Autowired
    IProduitRepository ipProduitRepository;
    @Autowired
    IClientRepository iClientRepository;
    @Override
    public Panier ajouterProduit(int produitID, int clientID, Long quantite){
        Client  client = iClientRepository.findById(clientID).get();
        Produit produit = ipProduitRepository.findById(produitID).get();
        Panier panier =ipanierRepository.findByClient(client);
        LigneCommande  ligneCommande = new LigneCommande();
        ligneCommande.setProduit(produit);
        ligneCommande.setQuantite(quantite);
        ligneCommande.setPrixunitaire( produit.getPrix());
        ligneCommande.setPanier(panier);
        panier.getLigneCommandes().add(ligneCommande);
        return ipanierRepository.save(panier);


    }
    @Override
    public Panier getPanier(int clientID){
        Client client = iClientRepository.findById(clientID).get();
        return ipanierRepository.findByClient(client);


    }
    @Override
    public Panier supprimerProduit(int clientID, int produitID){
        Client client = iClientRepository.findById(clientID).get();
        Panier panier =ipanierRepository.findByClient(client);
        LigneCommande ligneCommande=panier.getLigneCommandes().stream().filter(x->x.getProduit().getId()==produitID).findFirst().get();
        panier.getLigneCommandes().remove(ligneCommande);
        ligneCommande.setPanier(null);
        return ipanierRepository.save(panier);

    }

}

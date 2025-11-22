package com.sesame.ecommerceproject.Services;

import org.springframework.stereotype.Service;
import com.sesame.ecommerceproject.Repositories.ICommandeRepository;
import com.sesame.ecommerceproject.Entities.Commande;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class GestionServicesImpl implements IGestionCommande {

    @Autowired
    private ICommandeRepository commandeRepository;

    @Override
    public Commande ajouterCommande(Commande commande) {
        return commandeRepository.save(commande); // FIX
    }

    @Override
    public List<Commande> afficherCommandes() {
        return (List<Commande>) commandeRepository.findAll();
    }

    @Override
    public Commande afficherCommandeById(int id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerCommande(int idCommande) {
        commandeRepository.deleteById(idCommande);
    }

    @Override
    public Commande mettreAjourCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> getAll() {
        return (List<Commande>) commandeRepository.findAll();
    }
}

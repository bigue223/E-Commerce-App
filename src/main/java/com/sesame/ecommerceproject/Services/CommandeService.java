package com.sesame.ecommerceproject.Services;

import com.sesame.ecommerceproject.Entities.Commande;

import java.util.List;

public interface CommandeService {
    Commande getCommandeById(int id);
    Commande ajouterCommande(Commande c);
    Commande modifierCommande(Commande c);
    void supprimerCommande(int id);
    List<Commande> getAllCommandes();

}

package com.sesame.ecommerceproject.Services;

import com.sesame.ecommerceproject.Entities.Panier;
import com.sesame.ecommerceproject.Entities.Produit;

public interface PanierService {
    Panier ajouterProduit(int produitID, int clientID, Long quantite);


    Panier getPanier(int clientID);

    Panier supprimerProduit(int clientID, int produitID);
}

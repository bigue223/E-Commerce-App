package com.sesame.ecommerceproject.Services;

import com.sesame.ecommerceproject.Entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit ajouterProduit(Produit produit);
    List<Produit> getAllProduits();
    Produit getProduitById(int id);
    Produit updateProduit(Produit produit);
    void deleteProduitById(int id);
}

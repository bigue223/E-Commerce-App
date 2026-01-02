package com.sesame.ecommerceproject.Services;

import com.sesame.ecommerceproject.Entities.Categorie;

import java.util.List;

public interface CategorieService {
    Categorie ajouterCategorie(Categorie categorie);
    List<Categorie> getAllCategorie();
    Categorie updateCategorie(Categorie categorie);
    void deleteCategorie(int id);
    Categorie getCategorieById(int id);
}

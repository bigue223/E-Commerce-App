package com.sesame.ecommerceproject.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    private int id;
    private Long quantite;
    private Long prix;
    private  String nom;
    private  String description;
    private String marque;
    private String couleur;
    private String matiere;
    @Enumerated(EnumType.STRING)
    private GenreVetements genre;
    @Enumerated(EnumType.STRING)
    private TailleVetements taille;

    @OneToOne(mappedBy = "produit")
    private LigneCommande ligneCommande;
    @ManyToOne
    private Categorie categorie;
    @ManyToMany(mappedBy = "produits")
    private List<Promotion> promotions;

}

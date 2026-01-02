package com.sesame.ecommerceproject.Entities;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private Long quantite;
    @NotNull
    private float prix;
    @NotBlank
    private  String nom;
    @NotBlank
    private  String description;
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

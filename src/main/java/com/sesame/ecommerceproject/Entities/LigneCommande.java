package com.sesame.ecommerceproject.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LigneCommande implements Serializable {
    @Id
    private Long id;
    private Long prixunitaire;
    private  Long Quantite;

    @ManyToOne
    private Commande commande;
    @OneToOne
    private Produit produit;
    @ManyToOne()
    private Panier panier;
}

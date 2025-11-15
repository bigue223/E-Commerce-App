package com.sesame.ecommerceproject.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande implements Serializable {
    @Id
    private int id;
    private String etat;
    private Date datecommande;
    @Enumerated(EnumType.STRING)
    private StatusCommande statuscommande;
    @ManyToOne
    private Panier panier;
    @OneToOne
    private Paiement paiement;
    @OneToOne
    private Livraison livraison;
    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> lignesDeCommande;

}

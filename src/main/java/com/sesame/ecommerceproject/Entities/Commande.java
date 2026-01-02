package com.sesame.ecommerceproject.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Date datecommande;
    private double total;
    @Enumerated(EnumType.STRING)
    private StatusCommande statuscommande;

    @OneToOne
    private Paiement paiement;
    @OneToOne
    private Livraison livraison;
    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> lignesDeCommande;
    @ManyToOne
    private Client client;

}

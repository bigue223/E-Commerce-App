package com.sesame.ecommerceproject.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paiement implements Serializable {
    @Id
    private int id;
    private Long montant;
    private Date datepaiement;
    private String modepaiement;
    @Enumerated(EnumType.STRING)
    private StatusPaiement statuspaiement;
    @OneToOne(mappedBy = "paiement")
    private Commande commande;
}

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
public class Livraison implements Serializable {
    @Id
    private int id;
    private Long frais;
    private String AdresseLivraison;
    private String EtatLivraison;
    @Enumerated(EnumType.STRING)
    private StatusLivraison statuslivraison;
    @OneToOne(mappedBy = "livraison")
    private Commande commande;


}

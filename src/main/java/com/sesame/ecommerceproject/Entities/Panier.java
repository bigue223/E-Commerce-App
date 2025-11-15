package com.sesame.ecommerceproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Panier implements Serializable {
    @Id
    private int id;
    @OneToOne(mappedBy = "panier")
    private Client client;
    @OneToMany(mappedBy = "panier")
    private List<Commande> commandes;
}

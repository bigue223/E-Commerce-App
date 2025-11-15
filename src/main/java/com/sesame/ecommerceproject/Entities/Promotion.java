package com.sesame.ecommerceproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Promotion implements Serializable {
    @Id
    private int id;
    private String description;
    private Double pourcentage;
    private Date datedebut;
    private Date datefin;
    @ManyToMany
    private List<Produit> produits;
}

package com.sesame.ecommerceproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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

public class Client implements Serializable {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private Long telephone;
    private String email;
    private String password;
    @OneToOne
    private Panier panier;

}

package com.sesame.ecommerceproject;

import com.sesame.ecommerceproject.Entities.Categorie;
import com.sesame.ecommerceproject.Entities.Commande;
import com.sesame.ecommerceproject.Entities.Produit;
import com.sesame.ecommerceproject.Services.CategorieService;
import com.sesame.ecommerceproject.Services.CommandeService;
import com.sesame.ecommerceproject.Services.ProduitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ECommerceProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceProjectApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(ProduitService produitService, CategorieService categorieService) throws Exception {
        return (String[] args) -> {


            Categorie categorie = new Categorie();
            categorie.setNom("t-shirt");
            Categorie categorie2 = new Categorie();
            categorie2.setNom("pants");
            Categorie categorie3 = new Categorie();
            categorie3.setNom("parfum");
            Produit p1 = new Produit();
            p1.setQuantite((long)1000);
            p1.setPrix(10000);
            p1.setNom("savon");
            p1.setDescription("saaboun ");
            Produit p2 = new Produit();
            p2.setQuantite((long)1000);
            p2.setPrix(20000);
            p2.setNom("t-shirt");
            p2.setDescription("maryoul tricou");
            Produit p3 = new Produit();
            p3.setQuantite((long)1000);
            p3.setPrix(30000);
            p3.setNom("parfum");
            p3.setDescription("ososkjsjsj");
            produitService.ajouterProduit(p1);
            produitService.ajouterProduit(p2);
            produitService.ajouterProduit(p3);
            categorieService.ajouterCategorie(categorie);
            categorieService.ajouterCategorie(categorie2);
            categorieService.ajouterCategorie(categorie3);


        };
    }


}

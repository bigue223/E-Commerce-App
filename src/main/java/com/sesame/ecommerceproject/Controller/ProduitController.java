package com.sesame.ecommerceproject.Controller;

import com.sesame.ecommerceproject.Entities.Produit;
import com.sesame.ecommerceproject.Services.ProduitService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class ProduitController {
    @Autowired
    ProduitService produitService;

    @GetMapping("produits")
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @PostMapping("produit")
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.ajouterProduit(produit);
    }
    @GetMapping("produit/{id}")
    public Produit getProduitById(@Valid  @PathVariable("id") int id){
        return produitService.getProduitById(id);
    }
    @DeleteMapping("produit/{id}")
    public void deleteProduitById(@Valid  @PathVariable("id") int id){
        produitService.deleteProduitById(id);
    }
    @PutMapping("produit/{id}")
    public void updateProduitById(@Valid  @PathVariable("id") int id, @RequestBody Produit produit){
        final Produit p=produitService.getProduitById(id);
        p.setQuantite(produit.getQuantite());
        p.setPrix(produit.getPrix());
        p.setNom(produit.getNom());
        p.setDescription(produit.getDescription());
        p.setCategorie(produit.getCategorie());
        produitService.updateProduit(p);
    }

}

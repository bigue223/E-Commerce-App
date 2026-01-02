package com.sesame.ecommerceproject.Controller;

import com.sesame.ecommerceproject.Entities.Categorie;
import com.sesame.ecommerceproject.Entities.Produit;
import com.sesame.ecommerceproject.ServiceImplementation.CategorieServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CategoryController {
    @Autowired
    public CategorieServiceImpl categorieService;
    @GetMapping("categories")
    public List<Categorie> getAllCategories(){
        return categorieService.getAllCategorie();
    }
    @PostMapping("categorie")
    public Categorie addCategory( @RequestBody Categorie categorie){
        return categorieService.ajouterCategorie(categorie);
    }
    @GetMapping("categorie/{id}")
    public Categorie getCategoryById(  @PathVariable("id") int id){
        return categorieService.getCategorieById(id);
    }
    @DeleteMapping("categorie/{id}")
    public void deleteCategoryById( @Valid @PathVariable("id") int id){
         categorieService.deleteCategorie(id);
    }
    @PutMapping("categorie/{id}")
    public Categorie updateCategory( @Valid @PathVariable("id") int id ,@RequestBody Categorie categorie){
        final Categorie categorie1 = categorieService.getCategorieById(id);
        categorie1.setNom(categorie.getNom());
        return   categorieService.updateCategorie(categorie1);
    }



}

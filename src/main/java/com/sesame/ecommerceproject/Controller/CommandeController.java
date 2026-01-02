package com.sesame.ecommerceproject.Controller;

import com.sesame.ecommerceproject.Entities.Commande;
import com.sesame.ecommerceproject.Services.CategorieService;
import com.sesame.ecommerceproject.Services.CommandeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CommandeController {
    @Autowired
    CommandeService commandeService;
    @GetMapping("commandes")
    public List<Commande> getCommandes(){
        return commandeService.getAllCommandes();
    }
    @PostMapping("commande")
    public Commande ajouterCommande(@Valid  @RequestBody Commande c){
        return commandeService.ajouterCommande(c);
    }
    @GetMapping("commande{id}")
    public Commande getCommande(@PathVariable int id){
        return commandeService.getCommandeById(id);
    }
    @DeleteMapping("commande")
    public void supprimerCommande(@Valid @PathVariable int id){
        commandeService.supprimerCommande(id);
    }
    @PutMapping("commande{id}")
    public Commande modifierCommande(@Valid @RequestBody Commande c, @PathVariable int id){
        Commande c1=new Commande();

        c1.setTotal(c.getTotal());
        c1.setDatecommande(c.getDatecommande());
        return commandeService.modifierCommande(c);
    }
}

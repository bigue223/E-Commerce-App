package com.sesame.ecommerceproject.Services;
import org.springframework.stereotype.Service;
import com.sesame.ecommerceproject.Repositories.ICommandeRepository;




import com.sesame.ecommerceproject.Entities.Commande;

import java.util.List;

public interface IGestionCommande {
    public Commande ajouterCommande(Commande commande);
    public List<Commande> afficherCommandes();
    public Commande afficherCommandeById(int id);
    public void supprimerCommande(int idCommande);
    public Commande mettreAjourCommande(Commande commande);

    List<Commande> getAll();
}

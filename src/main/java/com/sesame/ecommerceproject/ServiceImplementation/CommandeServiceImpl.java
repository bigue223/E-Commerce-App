package com.sesame.ecommerceproject.ServiceImplementation;

import com.sesame.ecommerceproject.Entities.*;
import com.sesame.ecommerceproject.Repository.*;
import com.sesame.ecommerceproject.Services.CommandeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    ICommandeRepository commandeRepository;
    @Override
    public Commande getCommandeById(int id) {
        return commandeRepository.findById(id).get();
    }
    @Override
    public Commande ajouterCommande(Commande c) {
        return commandeRepository.save(c);
    }
    @Override
    public Commande modifierCommande(Commande c) {
        return commandeRepository.save(c);
    }
    @Override
    public void supprimerCommande(int id) {
        commandeRepository.deleteById(id);
    }
    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

}

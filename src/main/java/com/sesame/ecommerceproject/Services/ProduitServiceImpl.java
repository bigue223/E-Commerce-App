package com.sesame.ecommerceproject.Services;

import com.sesame.ecommerceproject.Entities.Produit;
import com.sesame.ecommerceproject.Repository.IProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitServiceImpl implements ProduitService {
    @Autowired IProduitRepository  iProduitRepository;

    @Override
    public List<Produit> getAllProduits(){
        return iProduitRepository.findAll();
    };
    @Override
    public Produit getProduitById(int id){
        return iProduitRepository.findById(id).get();
    }
    @Override
    public Produit updateProduit(Produit produit){

        return iProduitRepository.save(produit);
    }
    @Override
    public void deleteProduitById(int id){
        iProduitRepository.deleteById(id);
    }
    @Override
    public Produit ajouterProduit(Produit produit) {
        return iProduitRepository.save(produit);
    }
}

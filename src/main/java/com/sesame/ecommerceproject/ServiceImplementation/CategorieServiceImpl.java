package com.sesame.ecommerceproject.ServiceImplementation;

import com.sesame.ecommerceproject.Entities.Categorie;
import com.sesame.ecommerceproject.Repository.ICategorieRepository;
import com.sesame.ecommerceproject.Services.CategorieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategorieServiceImpl implements CategorieService {
    @Autowired
    ICategorieRepository icategorieRepository;
    @Override
    public  Categorie ajouterCategorie(Categorie categorie) {
        return icategorieRepository.save(categorie);
    }
    @Override
    public  Categorie updateCategorie(Categorie categorie) {
        return icategorieRepository.save(categorie);
    }
    @Override
    public void  deleteCategorie(int id) {
        icategorieRepository.deleteById(id);
    }
    @Override
    public Categorie getCategorieById(int id) {
        return icategorieRepository.findById(id).get();
    }
    @Override
    public List<Categorie> getAllCategorie(){
        return icategorieRepository.findAll();
    }
}

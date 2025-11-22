package com.sesame.ecommerceproject.Repositories;
import com.sesame.ecommerceproject.Entities.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduitRepository extends CrudRepository<Produit, Integer> {
}

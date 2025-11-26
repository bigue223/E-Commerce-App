package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduitRepository extends JpaRepository<Produit, Integer> {
}

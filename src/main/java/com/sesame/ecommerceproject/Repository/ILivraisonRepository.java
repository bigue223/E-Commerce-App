package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILivraisonRepository extends JpaRepository<Livraison, Integer> {
}

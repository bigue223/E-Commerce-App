package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IlingneCommandeRepository extends JpaRepository<LigneCommande, Integer> {
}

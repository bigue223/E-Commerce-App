package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommandeRepository extends JpaRepository<Commande, Integer> {
}

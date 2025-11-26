package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Administrateur;
import com.sesame.ecommerceproject.Entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaiementRepository  extends JpaRepository<Paiement, Integer> {
}

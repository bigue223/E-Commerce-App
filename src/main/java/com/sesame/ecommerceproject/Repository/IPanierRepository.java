package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Client;
import com.sesame.ecommerceproject.Entities.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPanierRepository extends JpaRepository<Panier, Integer> {
    Panier findByClient(Client client);
}

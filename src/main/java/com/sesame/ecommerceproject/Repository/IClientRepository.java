package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository  extends JpaRepository<Client, Integer> {
}

package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministrateurRepository  extends JpaRepository<Administrateur, Integer> {
}

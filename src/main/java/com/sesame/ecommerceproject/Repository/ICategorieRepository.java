package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategorieRepository extends JpaRepository<Categorie, Integer> {
}

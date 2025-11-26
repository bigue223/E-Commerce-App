package com.sesame.ecommerceproject.Repository;

import com.sesame.ecommerceproject.Entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPromotionRepository extends JpaRepository<Promotion, Integer> {
}

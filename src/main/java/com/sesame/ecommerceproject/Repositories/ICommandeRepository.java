package com.sesame.ecommerceproject.Repositories;
import com.sesame.ecommerceproject.Entities.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommandeRepository extends CrudRepository<Commande, Integer> {
}

package com.sesame.ecommerceproject.Repositories;
import com.sesame.ecommerceproject.Entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends CrudRepository<Client, Integer> {
}

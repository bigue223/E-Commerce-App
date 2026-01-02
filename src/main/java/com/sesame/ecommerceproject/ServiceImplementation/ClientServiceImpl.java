package com.sesame.ecommerceproject.ServiceImplementation;

import com.sesame.ecommerceproject.Entities.Client;
import com.sesame.ecommerceproject.Repository.IClientRepository;
import com.sesame.ecommerceproject.Services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl  implements ClientService {
    @Autowired
    IClientRepository iclientRepository;
    @Override
    public Client findClientByID(int clientID) {
        return iclientRepository.findById(clientID).get();
    }
    @Override
    public Client ajouterClient(Client client) {
        return iclientRepository.save(client);
    }
    @Override
    public List<Client> getAllClients() {
        return iclientRepository.findAll();
    }
    @Override
    public void supprimerClient(int clientID) {
        iclientRepository.deleteById(clientID);
    }
    @Override
    public Client updateClient(Client client) {
        return iclientRepository.save(client);
    }
}

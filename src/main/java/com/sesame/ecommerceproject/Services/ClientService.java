package com.sesame.ecommerceproject.Services;

import com.sesame.ecommerceproject.Entities.Client;

import java.util.List;

public interface ClientService {
    void supprimerClient(int clientID);
    Client ajouterClient(Client client);
    List<Client> getAllClients();
    Client findClientByID(int clientID);
    Client updateClient(Client client);
}

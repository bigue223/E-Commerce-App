package com.sesame.ecommerceproject.Services;

import com.sesame.ecommerceproject.Entities.Commande;

public interface CommandeService {
    Commande checkout(int clientID, String modepaiement);
}

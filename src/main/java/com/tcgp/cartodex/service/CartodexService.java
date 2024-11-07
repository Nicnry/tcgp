package com.tcgp.cartodex.service;

import com.tcgp.cartodex.model.Cartodex;
import com.tcgp.cartodex.repository.CartodexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CartodexService {

    private final CartodexRepository cartodexRepository;

    @Autowired
    public CartodexService(CartodexRepository cartodexRepository) {
        this.cartodexRepository = cartodexRepository;
    }

    // Créer un nouveau Cartodex
    public Cartodex createCartodex(@Valid Cartodex cartodex) {
        return cartodexRepository.save(cartodex);
    }

    // Lire tous les Cartodex
    public List<Cartodex> getAllCartodex() {
        return cartodexRepository.findAll();
    }

    // Lire un Cartodex par son ID
    public Optional<Cartodex> getCartodexById(Long id) {
        return cartodexRepository.findById(id);
    }

    // Mettre à jour un Cartodex
    public Cartodex updateCartodex(Long id, Cartodex cartodexDetails) {
        Cartodex cartodex = cartodexRepository.findById(id).orElseThrow();
        cartodex.setNom(cartodexDetails.getNom());
        cartodex.setDescription(cartodexDetails.getDescription());
        return cartodexRepository.save(cartodex);
    }

    // Supprimer un Cartodex
    public void deleteCartodex(Long id) {
        cartodexRepository.deleteById(id);
    }
}

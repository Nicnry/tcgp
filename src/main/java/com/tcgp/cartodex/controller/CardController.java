package com.tcgp.cartodex.controller;

import com.tcgp.cartodex.model.Card;
import com.tcgp.cartodex.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    // Obtenir toutes les cartes
    @GetMapping
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    // Obtenir une carte par son ID
    @GetMapping("/{id}")
    public Optional<Card> getCardById(@PathVariable int id) {
        return cardService.getCardById(id);
    }

    // Créer ou mettre à jour une carte
    @PostMapping
    public Card createOrUpdateCard(@RequestBody Card card) {
        return cardService.createOrUpdateCard(card);
    }

    // Supprimer une carte
    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable int id) {
        cardService.deleteCard(id);
    }
}

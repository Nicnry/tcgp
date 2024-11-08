package com.tcgp.cartodex.service;

import com.tcgp.cartodex.model.Card;
import com.tcgp.cartodex.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    public Optional<Card> getCardById(int id) {
        return cardRepository.findById(id);
    }

    public Card createOrUpdateCard(Card card) {
        return cardRepository.save(card);
    }

    public void deleteCard(int id) {
        cardRepository.deleteById(id);
    }
}

package com.tcgp.cartodex.repository;

import com.tcgp.cartodex.model.Cartodex;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartodexRepository extends JpaRepository<Cartodex, Long> {
    
}
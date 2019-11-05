package com.sid.dao;

import com.sid.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}

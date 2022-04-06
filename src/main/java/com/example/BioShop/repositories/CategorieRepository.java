package com.example.BioShop.repositories;

import com.example.BioShop.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

    public Categorie findCategorieByNom(String nom);
}

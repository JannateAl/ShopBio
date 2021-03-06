package com.example.BioShop.services;

import com.example.BioShop.entities.Categorie;
import com.example.BioShop.entities.Produit;
import com.example.BioShop.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService implements ICategorieService{

    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public List<Produit> findProduitsbyCategorieNom(String nom) {

        Categorie categorie = categorieRepository.findCategorieByNom(nom);

        return categorie.getProduits();

    }
}

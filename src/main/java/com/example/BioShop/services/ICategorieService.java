package com.example.BioShop.services;

import com.example.BioShop.entities.Produit;

import java.util.List;

public interface ICategorieService {

    public List<Produit> findProduitsbyCategorieNom(String nom);
}

package com.example.BioShop.services;

import com.example.BioShop.entities.Produit;

import java.util.List;

public interface IProduitService {
    
    public List<Produit> getProduitsbyCooperativeAndCategorie(String categorieNom,String cooperativeNom);
}

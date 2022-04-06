package com.example.BioShop.services;

import com.example.BioShop.entities.Produit;
import com.example.BioShop.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService implements IProduitService{

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getProduitsbyCooperativeAndCategorie(String categorieNom, String cooperativeNom) {
        return produitRepository.findProduitByCategorieNomAndAndCooperativeNom(categorieNom,cooperativeNom);
    }
}

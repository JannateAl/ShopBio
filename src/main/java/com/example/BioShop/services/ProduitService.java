package com.example.BioShop.services;

import com.example.BioShop.entities.Cooperative;
import com.example.BioShop.entities.Produit;
import com.example.BioShop.repositories.CooperativeRepository;
import com.example.BioShop.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduitService implements IProduitService{

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private CooperativeRepository cooperativeRepository;

    @Override
    public List<Produit> getProduitsbyCooperativeAndCategorie(String categorieNom, String cooperativeNom) {
        return produitRepository.findProduitByCategorieNomAndAndCooperativeNom(categorieNom,cooperativeNom);
    }

    @Override
    public List<Produit> getProduitsByRegion(String nom) {

        List<Cooperative> cooperatives = cooperativeRepository.findCooperativeByRegionNom(nom);

        List<Produit> produits = new ArrayList<>();

        for (Cooperative cooperative:cooperatives) {
            List<Produit> temp = produitRepository.findProduitByCooperative(cooperative);
            produits.addAll(temp);
        }

        return produits;
    }


}

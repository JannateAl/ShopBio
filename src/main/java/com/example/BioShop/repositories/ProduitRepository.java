package com.example.BioShop.repositories;
import com.example.BioShop.entities.Cooperative;
import com.example.BioShop.entities.Produit;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

    public List<Produit> findProduitByCategorieNomAndAndCooperativeNom(String categorieNom, String cooperativeNom);

    public List<Produit> findProduitByCooperative(Cooperative cooperative);
}

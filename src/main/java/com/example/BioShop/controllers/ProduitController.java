package com.example.BioShop.controllers;

import com.example.BioShop.entities.Produit;
import com.example.BioShop.repositories.ProduitRepository;
import com.example.BioShop.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/produits")
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit) {
       return produitRepository.save(produit);
    }

    @GetMapping(path = "/cooperative/{cooperative}/categorie/{categorie}")
    public List<Produit> getProduitsCooperativeAndCategorie(@PathVariable("categorie") String categorieNom,
                                                            @PathVariable("cooperative") String cooperativeNom) {

        return produitService.getProduitsbyCooperativeAndCategorie(categorieNom,cooperativeNom);
    }

    @GetMapping(path="/{region}/region")
    public List<Produit> getCooperativesByRegion(@PathVariable("region") String nom) {
        return produitService.getProduitsByRegion(nom);
    }
}

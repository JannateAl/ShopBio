package com.example.BioShop.services;

import com.example.BioShop.entities.Cooperative;
import com.example.BioShop.repositories.CooperativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CooperativeService implements ICooperativeService{

    @Autowired
    private CooperativeRepository cooperativeRepository;

    @Override
    public List<Cooperative> getCooperativeByRegion(String nom) {
        return cooperativeRepository.findCooperativeByRegionNom(nom);
    }
}

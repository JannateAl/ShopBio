package com.example.BioShop.services;

import com.example.BioShop.entities.Cooperative;

import java.util.List;

public interface ICooperativeService {

    public List<Cooperative> getCooperativeByRegion(String nom);
}

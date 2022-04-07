package com.example.BioShop.repositories;
import com.example.BioShop.entities.Cooperative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CooperativeRepository extends JpaRepository<Cooperative, Long> {

    public List<Cooperative> findCooperativeByRegionNom(String nom);
}




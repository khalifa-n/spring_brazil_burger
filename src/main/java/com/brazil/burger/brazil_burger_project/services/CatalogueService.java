package com.brazil.burger.brazil_burger_project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brazil.burger.brazil_burger_project.models.Burger;
import com.brazil.burger.brazil_burger_project.repositories.BurgerRepository;

import lombok.extern.java.Log;


@Service
@Log
public class CatalogueService {
    @Autowired
    private BurgerRepository burgerRepository;
    // ##################service burger ############
    public Burger addBurger(Burger burger) {
        try {
            burgerRepository.save(burger);
            return burger;
        } catch (Exception e) {
            log.severe(e.getLocalizedMessage());
            throw e;
        }
    }
    public List<Burger> getAllBurger(){
        return burgerRepository.findAll();
    }
    
}

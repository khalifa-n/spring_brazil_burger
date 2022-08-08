package com.brazil.burger.brazil_burger_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brazil.burger.brazil_burger_project.models.Burger;

public interface BurgerRepository extends JpaRepository<Burger ,Long> {
    
}

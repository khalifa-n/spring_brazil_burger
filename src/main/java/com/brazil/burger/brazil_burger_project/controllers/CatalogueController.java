package com.brazil.burger.brazil_burger_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.brazil.burger.brazil_burger_project.models.Burger;

import aj.org.objectweb.asm.Attribute;

@Controller
public class CatalogueController {
    
    @GetMapping({"/","index"})
    public String index(Model model) {
        return "index";
    }
    @GetMapping("/Burger")
    public String getViewAddBurger(Model model){
        Burger burger = new Burger();
        model.addAttribute("attribute",attribute);
        return "Burger/Burger-add";
    }
}

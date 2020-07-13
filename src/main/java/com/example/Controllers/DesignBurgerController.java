package com.example.Controllers;


import com.example.Model.Burger;
import com.example.Model.Ingredient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignBurgerController {

    @GetMapping
    public String showDesignForm(Model model) {

        ArrayList<Ingredient>ingredients=new ArrayList<>();
        ingredients.add(new Ingredient(1, "Bottom bun", 2.0));
        ingredients.add(new Ingredient(2, "Top bun", 2.0));
        ingredients.add( new Ingredient(3, "Patty", 5.5));
        ingredients.add(new Ingredient(4, "Catchup", 1.0));
        ingredients.add(new Ingredient(5, "Mustard", 1.0));
        ingredients.add(new Ingredient(6, "Lattice", 4.3));
        ingredients.add(new Ingredient(7, "Pickle", 2.0));
        ingredients.add(new Ingredient(8, "Cheese", 3.0));

        model.addAttribute(ingredients);
        model.addAttribute("design", new Burger());
        return "DesignPage";
    }

    @PostMapping
    public String processDesign() {
        //  log.info("Processing design: " + design);
        return "redirect:/orders/current";
    }
}

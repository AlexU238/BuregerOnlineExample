package com.example.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;

@Data
@RequiredArgsConstructor
public class Burger {
    private String name;
    private List<Ingredient> ingredientList;

}

package com.example.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Ingredient {
    private final int id;
    private final String name;
    private final double price;
}


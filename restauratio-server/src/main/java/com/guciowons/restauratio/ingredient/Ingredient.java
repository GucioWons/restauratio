package com.guciowons.restauratio.ingredient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Ingredient {
    private UUID id;

    private String name;
}

package com.guciowons.restauratio.ingredient.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class IngredientDTO {
    private UUID id;

    private String name;
}

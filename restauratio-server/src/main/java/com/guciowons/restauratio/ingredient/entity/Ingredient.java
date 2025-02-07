package com.guciowons.restauratio.ingredient.entity;

import com.guciowons.restauratio.generic.entity.RestaurantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Ingredient extends RestaurantEntity {
    private UUID id;

    private String name;
}

package com.guciowons.restauratio.dish;

import com.guciowons.restauratio.category.Category;
import com.guciowons.restauratio.generic.RestaurantEntity;
import com.guciowons.restauratio.image.Image;
import com.guciowons.restauratio.ingredient.Ingredient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Dish extends RestaurantEntity {
    private UUID id;

    private String name;

    private String description;

    private BigDecimal price;

    private boolean isAvailable = true;

    private Category category;

    private Image image;

    private List<Ingredient> ingredients;
}

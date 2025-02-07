package com.guciowons.restauratio.dish.dto;

import com.guciowons.restauratio.ingredient.dto.IngredientDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class DishDTO {
    private UUID id;

    private String name;

    private String description;

    private BigDecimal price;

    private boolean isAvailable;

    private UUID imageId;

    private List<IngredientDTO> ingredients;
}

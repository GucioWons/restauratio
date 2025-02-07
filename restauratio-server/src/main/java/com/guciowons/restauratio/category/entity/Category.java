package com.guciowons.restauratio.category.entity;

import com.guciowons.restauratio.generic.entity.RestaurantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Category extends RestaurantEntity {
    private UUID id;

    private String name;
}

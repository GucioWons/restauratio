package com.guciowons.restauratio.category;

import com.guciowons.restauratio.restaurant.Restaurant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Category {
    private UUID id;

    private String name;

    private Restaurant restaurant;
}

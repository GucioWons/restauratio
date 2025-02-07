package com.guciowons.restauratio.generic.entity;

import com.guciowons.restauratio.restaurant.entity.Restaurant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class RestaurantEntity implements Entity {
    private Restaurant restaurant;
}

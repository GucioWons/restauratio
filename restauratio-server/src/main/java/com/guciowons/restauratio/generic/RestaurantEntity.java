package com.guciowons.restauratio.generic;

import com.guciowons.restauratio.restaurant.Restaurant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class RestaurantEntity implements Entity {
    private Restaurant restaurant;
}

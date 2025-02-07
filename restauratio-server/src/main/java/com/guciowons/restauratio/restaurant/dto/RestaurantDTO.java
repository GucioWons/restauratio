package com.guciowons.restauratio.restaurant.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class RestaurantDTO {
    private UUID id;

    private String name;

    private String description;

    private UUID logoId;
}

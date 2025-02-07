package com.guciowons.restauratio.table.dto;

import com.guciowons.restauratio.restaurant.dto.RestaurantDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class TableDTO {
    private UUID id;

    private String name;

    private RestaurantDTO restaurant;
}

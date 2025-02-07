package com.guciowons.restauratio.table;

import com.guciowons.restauratio.generic.RestaurantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Table extends RestaurantEntity {
    private UUID id;

    private String name;
}

package com.guciowons.restauratio.restaurant.entity;

import com.guciowons.restauratio.generic.entity.Entity;
import com.guciowons.restauratio.image.entity.Image;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Restaurant implements Entity {
    private UUID id;

    private String name;

    private String description;

    private Image logo;
}

package com.guciowons.restauratio.restaurant;

import com.guciowons.restauratio.image.Image;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Restaurant {
    private UUID id;

    private String name;

    private String description;

    private Image logo;
}

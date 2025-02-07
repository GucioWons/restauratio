package com.guciowons.restauratio.image;

import com.guciowons.restauratio.generic.RestaurantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Image extends RestaurantEntity {
    private UUID id;

    private byte[] content;

    private String name;
}

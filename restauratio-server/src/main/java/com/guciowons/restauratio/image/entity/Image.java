package com.guciowons.restauratio.image.entity;

import com.guciowons.restauratio.generic.entity.RestaurantEntity;
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
}

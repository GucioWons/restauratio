package com.guciowons.restauratio.image;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Image {
    UUID id;

    byte[] content;

    String name;
}

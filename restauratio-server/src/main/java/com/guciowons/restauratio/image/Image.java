package com.guciowons.restauratio.image;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Image {
    private UUID id;

    private byte[] content;

    private String name;
}

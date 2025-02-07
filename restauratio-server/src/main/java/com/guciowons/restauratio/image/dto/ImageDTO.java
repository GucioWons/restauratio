package com.guciowons.restauratio.image.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class ImageDTO {
    private UUID id;

    private byte[] content;
}

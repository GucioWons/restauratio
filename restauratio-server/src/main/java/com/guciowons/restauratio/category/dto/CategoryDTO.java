package com.guciowons.restauratio.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDTO {
    private UUID id;

    private String name;
}

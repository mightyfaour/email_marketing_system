package com.philip.email_marketing_system.DTOs.tagDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTagRequest {
    @NotBlank
    private String name;
}

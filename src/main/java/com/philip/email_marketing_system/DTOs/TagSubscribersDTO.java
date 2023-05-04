package com.philip.email_marketing_system.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TagSubscribersDTO {
    private Long id;
    private Long subscriberId;
    private Long tagId;
}

package com.philip.email_marketing_system.DTOs.tagDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateTagResponse {
    private String id;
    private String name;
    private List<String> subscriberIds;
    private boolean successful;
}

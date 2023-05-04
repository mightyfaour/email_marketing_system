package com.philip.email_marketing_system.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriberDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime unsubscribedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

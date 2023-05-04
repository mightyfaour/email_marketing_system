package com.philip.email_marketing_system.data.model.subscribersObjet;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "subscriber")
public class Subscribers {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime unsubscribedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
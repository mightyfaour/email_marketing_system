package com.philip.email_marketing_system.data.model.subscriberTagObject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subscriber-tagn")
public class SubscriberTag {
    @Id
    private int id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long subscriberId;
    private Long tagId;

}


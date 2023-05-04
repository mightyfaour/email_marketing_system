package com.philip.email_marketing_system.data.model.campaign;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "campaign")
public class Campaign {

    @Id
    private int id;
    private String name;
    private String subject;
    private String content;
    private int statusId;
    private int templateId;
    private int emailServiceId;
    private String fromName;
    private String fromEmail;
    private boolean isOpenTracking;
    private boolean isClickTracking;
    private int sentCount;
    private int openCount;
    private int clickCount;
    private boolean sendToAll;
    private List<String> tags;
    private boolean saveAsDraft;
    private LocalDateTime scheduledAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}

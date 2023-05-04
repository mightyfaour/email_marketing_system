package com.philip.email_marketing_system.DTOs.tagsubscribers;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AddTagSubscriberResponse {
    private boolean successful;
    private Long tagSubscriberId;

}
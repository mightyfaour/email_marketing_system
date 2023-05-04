package com.philip.email_marketing_system.DTOs.tagsubscribers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddTagSubscriberRequest {
    private Long tagId;
    private Long subscriberId;

}



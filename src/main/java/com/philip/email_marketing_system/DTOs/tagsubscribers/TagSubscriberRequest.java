package com.philip.email_marketing_system.DTOs.tagsubscribers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TagSubscriberRequest {
    private Long tagId;
    private Long subscriberId;

}

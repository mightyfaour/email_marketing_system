package com.philip.email_marketing_system.data.repositories;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TagSubscribersId implements Serializable {

    private Long tagId;

    private Long subscriberId;

}

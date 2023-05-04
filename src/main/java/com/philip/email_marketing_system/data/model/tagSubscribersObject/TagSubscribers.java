package com.philip.email_marketing_system.data.model.tagSubscribersObject;

import com.philip.email_marketing_system.data.model.subscribersObjet.Subscriber;
import com.philip.email_marketing_system.data.model.tagObject.Tags;
import com.philip.email_marketing_system.data.repositories.TagSubscribersId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tag_subscribers")
public class TagSubscribers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subscriber_id")
    private Subscriber subscriber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private Tags tags;
}


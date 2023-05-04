package com.philip.email_marketing_system.data.repositories;

import com.philip.email_marketing_system.data.model.subscribersObjet.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.concurrent.Flow;

@Repository
public interface SubscriberRepository extends JpaRepository<Flow.Subscriber, Integer> {
    Optional<Flow.Subscriber> findByEmail(String email);

    Optional<Subscriber> findById(Long subscriberId);
}

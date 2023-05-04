package com.philip.email_marketing_system.data.repositories;

import com.philip.email_marketing_system.data.model.tagObject.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagRepository extends JpaRepository<Tags, Long> {
    Optional<Tags> findByName(String name);
}

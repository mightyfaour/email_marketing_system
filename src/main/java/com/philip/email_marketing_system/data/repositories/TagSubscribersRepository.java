package com.philip.email_marketing_system.data.repositories;

import com.philip.email_marketing_system.data.model.tagSubscribersObject.TagSubscribers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagSubscribersRepository extends JpaRepository<TagSubscribers, Long> {
    List<TagSubscribers> findBySubscriberId(Long subscriberId);
    List<TagSubscribers> findByTagId(Long tagId);
    void deleteBySubscriberId(Long subscriberId);
    void deleteByTagId(Long tagId);
}


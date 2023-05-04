package com.philip.email_marketing_system.data.repositories;

import com.philip.email_marketing_system.data.model.templateObject.Templates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TemplateRepository extends JpaRepository<Templates, Long> {
    Optional<Templates> findById(Long id);
}


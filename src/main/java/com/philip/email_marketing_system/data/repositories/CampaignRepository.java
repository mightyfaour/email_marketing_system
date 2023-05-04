package com.philip.email_marketing_system.data.repositories;

import com.philip.email_marketing_system.data.model.campaign.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}

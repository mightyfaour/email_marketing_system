package com.philip.email_marketing_system.services.service;

import com.philip.email_marketing_system.data.model.campaign.Campaign;

import java.util.List;

public interface CampaignService {
    Campaign createCampaign(Campaign campaign);
    Campaign updateCampaign(Long id, Campaign campaign);
    void deleteCampaign(Long id);
    List<Campaign> getAllCampaigns();
    Campaign getCampaignById(Long id);
}


package com.philip.email_marketing_system.services.serviceImpl;

import com.philip.email_marketing_system.data.model.campaign.Campaign;
import com.philip.email_marketing_system.data.repositories.CampaignRepository;
import com.philip.email_marketing_system.exception.ResourceNotFoundException;
import com.philip.email_marketing_system.services.service.CampaignService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class CampaignServiceImpl implements CampaignService {
    private final CampaignRepository campaignRepository;

    @Override
    public Campaign createCampaign(Campaign campaign) {
        campaign.setCreatedAt(LocalDateTime.now());
        return campaignRepository.save(campaign);
    }

    @Override
    public Campaign updateCampaign(Long id, Campaign campaign) {
        Campaign existingCampaign = campaignRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Campaign not found with id: " + id));

        existingCampaign.setName(campaign.getName());
        existingCampaign.setSubject(campaign.getSubject());
        existingCampaign.setContent(campaign.getContent());
        existingCampaign.setSentAt(campaign.getSentAt());
        existingCampaign.setUpdatedAt(LocalDateTime.now());

        return campaignRepository.save(existingCampaign);
    }

    @Override
    public void deleteCampaign(Long id) {
        Campaign campaign = campaignRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Campaign not found with id: " + id));

        campaignRepository.delete(campaign);
    }

    @Override
    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    @Override
    public Campaign getCampaignById(Long id) {
        return campaignRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Campaign not found with id: " + id));
    }
}

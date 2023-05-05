package com.philip.email_marketing_system.services;

import com.philip.email_marketing_system.data.model.campaign.Campaign;
import com.philip.email_marketing_system.data.model.subscribersObjet.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {

    @Autowired
    private EmailServiceFactory emailServiceFactory;

    public void sendCampaignEmails(Campaign campaign) {
        EmailService emailService = emailServiceFactory.getEmailService(campaign.getEmailServiceProvider());

        List<Subscriber> subscribers = campaign.getSubscribers();
        Template template = campaign.getTemplate();

        for (Subscriber subscriber : subscribers) {
            String subject = template.getSubject();
            String body = template.getBody();
            String recipient = subscriber.getEmail();

            emailService.sendEmail(subject, body, recipient);
        }
    }

    // Other methods for CRUD operations on Campaign objects...
}

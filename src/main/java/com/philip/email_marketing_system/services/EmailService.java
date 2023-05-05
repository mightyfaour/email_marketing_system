package com.philip.email_marketing_system.services;

import com.philip.email_marketing_system.data.model.campaign.Campaign;
import com.philip.email_marketing_system.data.model.subscribersObjet.Subscribers;
//import com.philipneo.emailmarketingsystem.data.model.Campaign;
//import com.philipneo.emailmarketingsystem.data.model.Subscribers;

import java.util.List;

public interface EmailService {
//    void sendEmail(Campaign campaign, List<Subscribers> subscribers);
    void sendEmail(String recipient, String subject, String body);
}

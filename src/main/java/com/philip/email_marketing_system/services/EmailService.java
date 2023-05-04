package com.philip.email_marketing_system.services;

import com.philipneo.emailmarketingsystem.data.model.Campaign;
import com.philipneo.emailmarketingsystem.data.model.Subscribers;

import java.util.List;

public interface EmailService {
    void sendEmail(Campaign campaign, List<Subscribers> subscribers);
}

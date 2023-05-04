package com.philip.email_marketing_system.services.service;

import com.philip.email_marketing_system.DTOs.SubscriberDto;
import com.philip.email_marketing_system.exception.ResourceNotFoundException;

import java.util.List;

public interface SubscriberService {
    SubscriberDto addSubscriber(SubscriberDto subscriberDTO);
    SubscriberDto getSubscriberById(int id) throws ResourceNotFoundException;
    SubscriberDto getSubscriberByEmail(String email) throws ResourceNotFoundException;
    List<SubscriberDto> getAllSubscribers();
    SubscriberDto updateSubscriber(int id, SubscriberDto subscriberDTO) throws ResourceNotFoundException;
    void deleteSubscriber(int id) throws ResourceNotFoundException;
}

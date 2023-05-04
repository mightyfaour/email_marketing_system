package com.philip.email_marketing_system.services.serviceImpl;

import com.philip.email_marketing_system.DTOs.SubscriberDto;
import com.philip.email_marketing_system.data.repositories.SubscriberRepository;
import com.philip.email_marketing_system.services.service.SubscriberService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class SubscriberServiceImpl implements SubscriberService {

    private final SubscriberRepository subscriberRepository;

    @Override
    public SubscriberDto addSubscriber(SubscriberDto subscriberDTO) {
        Subscriber subscriber = new Subscriber();
        BeanUtils.copyProperties(subscriberDTO, subscriber);
        subscriber.setCreatedAt(LocalDateTime.now());
        Subscriber savedSubscriber = subscriberRepository.save(subscriber);
        BeanUtils.copyProperties(savedSubscriber, subscriberDTO);
        return subscriberDTO;
    }

    @Override
    public SubscriberDto addSubscriber(SubscriberDto subscriberDTO) {
        return null;
    }

    @Override
    public SubscriberDto getSubscriberById(int id) throws ResourceNotFoundException {
        Subscriber subscriber = subscriberRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Subscriber not found with id: " + id));
        SubscriberDto subscriberDTO = new SubscriberDto();
        BeanUtils.copyProperties(subscriber, subscriberDTO);
        return subscriberDTO;
    }

    @Override
    public SubscriberDto getSubscriberByEmail(String email) throws ResourceNotFoundException {
        Subscriber subscriber = subscriberRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Subscriber not found with email: " + email));
        SubscriberDto subscriberDTO = new SubscriberDto();
        BeanUtils.copyProperties(subscriber, subscriberDTO);
        return subscriberDTO;
    }

    @Override
    public List<SubscriberDto> getAllSubscribers() {
        List<Subscriber> subscribers = subscriberRepository.findAll();
        List<SubscriberDto> subscriberDTOs = new ArrayList<>();
        subscribers.forEach(subscriber -> {
            SubscriberDto subscriberDTO = new SubscriberDto();
            BeanUtils.copyProperties(subscriber, subscriberDTO);
            subscriberDTOs.add(subscriberDTO);
        });
        return subscriberDTOs;
    }

    @Override
    public SubscriberDto updateSubscriber(int id, SubscriberDto subscriberDTO) throws ResourceNotFoundException {
        Subscriber existingSubscriber = subscriberRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Subscriber not found with id: " + id));
        existingSubscriber.setFirstName(subscriberDTO.getFirstName());
        existingSubscriber.setLastName(subscriberDTO.getLastName());
        existingSubscriber.setEmail(subscriberDTO.getEmail());
        existingSubscriber.setUnsubscribedAt(subscriberDTO.getUnsubscribedAt());
        existingSubscriber.setUpdatedAt(LocalDateTime.now());
        Subscriber savedSubscriber = subscriberRepository.save(existingSubscriber);
        BeanUtils.copyProperties(savedSubscriber, subscriberDTO);
        return subscriberDTO;
    }

    @Override
    public void deleteSubscriber(int id) throws ResourceNotFoundException {
        Subscriber existingSubscriber = subscriberRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Subscriber not found with id: " + id));
        subscriberRepository.delete(existingSubscriber);
    }
}

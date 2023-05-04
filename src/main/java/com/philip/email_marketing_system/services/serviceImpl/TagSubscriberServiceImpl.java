package com.philip.email_marketing_system.services.serviceImpl;

import com.philip.email_marketing_system.DTOs.TagSubscribersDTO;
import com.philip.email_marketing_system.DTOs.tagsubscribers.AddTagSubscriberRequest;
import com.philip.email_marketing_system.DTOs.tagsubscribers.AddTagSubscriberResponse;
import com.philip.email_marketing_system.data.model.tagSubscribersObject.TagSubscribers;
import com.philip.email_marketing_system.data.repositories.TagSubscribersRepository;
import com.philip.email_marketing_system.exception.TagException;
import com.philip.email_marketing_system.services.service.TagSubscribersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TagSubscriberServiceImpl implements TagSubscribersService {

    private final TagSubscribersRepository tagSubscribersRepository;

    @Override
    public AddTagSubscriberResponse addTagSubscribers(AddTagSubscriberRequest addTagSubscriberRequest) {
        TagSubscribers tagSubscribers = buildTagSubscriber(addTagSubscriberRequest);
        TagSubscribers savedTagSubscriber = tagSubscribersRepository.save(tagSubscribers);
        return AddTagSubscriberResponse.builder()
                .successful(true)
                .id(String.valueOf(savedTagSubscriber.getId()))
                .build();
    }

    private TagSubscribers buildTagSubscriber(AddTagSubscriberRequest addTagSubscriberRequest) {
        return TagSubscribers.bui
    }

    private TagSubscribers buildTagSubscriber(Alder()
                .subscriberId(addTagSubscriberRequest.getSubscriberId())
                .tagId(addTagSubscriberRequest.getTagId())
                .build();
    }

    @Override
    public List<TagSubscriber> getAllTagSubscribers() {
        return tagSubscriberRepository.findAll();
    }

    @Override
    public TagSubscriber findById(String id) throws TagException {
        Optional<TagSubscriber> foundTagSubscriber = tagSubscriberRepository.findById(Long.valueOf(id));
        if (foundTagSubscriber.isEmpty()) {
            throw new TagException("Tag Subscriber with Id " + id + " does not exist", 404);
        }
        return foundTagSubscriber.get();
    }

    @Override
    public DeleteTagSubscriberResponse deleteTagSubscriberById(String id) throws TagException {
        Optional<TagSubscriber> foundTagSubscriber = tagSubscriberRepository.findById(Long.valueOf(id));
        if (foundTagSubscriber.isEmpty()) {
            throw new TagException("Tag Subscriber with Id " + id + " does not exist", 404);
        }
        tagSubscriberRepository.deleteById(Long.valueOf(id));
        return new DeleteTagSubscriberResponse(true);
    }
}

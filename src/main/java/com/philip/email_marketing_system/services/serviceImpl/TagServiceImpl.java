package com.philip.email_marketing_system.services.serviceImpl;

import com.philip.email_marketing_system.DTOs.tagDtos.*;
import com.philip.email_marketing_system.data.model.tagObject.Tags;
import com.philip.email_marketing_system.data.repositories.TagRepository;
import com.philip.email_marketing_system.exception.TagException;
import com.philip.email_marketing_system.services.service.TagService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TagServiceImpl implements TagService {
    private TagRepository tagRepository;

    @Override
    public AddTagResponse addTag(AddTagRequest addTagRequest) throws TagException {
        Optional<Tags> foundTag = tagRepository.findByName(addTagRequest.getName());
        if (foundTag.isPresent()) {
            throw new TagException("Tag with name " + addTagRequest.getName() + " already exists");
        }
        Tags tags = new Tags();
        tags.setName(addTagRequest.getName());
        Tags savedTag = tagRepository.save(tags);
        return new AddTagResponse(true, savedTag.getId());
    }

//    @Override
//    public AddTagResponse addTag(AddTagRequest addTagRequest) throws TagException {
//        return null;
//    }

    @Override
    public List<Tags> getAllTags() {
        return tagRepository.findAll();
    }

    @Override
    public Tags findById(Long id) throws TagException {
        Optional<Tags> foundTag = tagRepository.findById(id);
        if (foundTag.isEmpty()) {
            throw new TagException("Tag with Id " + id + " does not exist");
        }
        return foundTag.get();
    }

    @Override
    public DeleteTagResponse deleteTagById(Long id) throws TagException {
        Optional<Tags> foundTag = tagRepository.findById(id);
        if (foundTag.isEmpty()) {
            throw new TagException("Tag with Id " + id + " does not exist");
        }
        tagRepository.deleteById(id);
        return new DeleteTagResponse(true);
    }

//    @Override
//    public UpdateTagResponse updateTagDetails(Long id, UpdateTagRequest updateTagRequest) throws TagException {
//        return null;
//    }

    @Override
    public UpdateTagResponse updateTagDetails(Long id, UpdateTagRequest updateTagRequest) throws TagException {
        Optional<Tags> foundTag = tagRepository.findById(id);
        if (foundTag.isEmpty()) {
            throw new TagException("Tag with Id " + id + " does not exist");
        }
        Tags tag = foundTag.get();
        tag.setName(updateTagRequest.getName());
        Tags updatedTag = tagRepository.save(tag);
        UpdateTagResponse updateTagResponse = new UpdateTagResponse();
        BeanUtils.copyProperties(updatedTag, updateTagResponse);
        return updateTagResponse;
    }
}

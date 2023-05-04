package com.philip.email_marketing_system.services.service;

import com.philip.email_marketing_system.DTOs.tagDtos.*;
import com.philip.email_marketing_system.data.model.tagObject.Tags;
import com.philip.email_marketing_system.exception.TagException;

import java.util.List;

public interface TagService {
    AddTagResponse addTag(AddTagRequest addTagRequest) throws TagException;
    List<Tags> getAllTags();
    Tags findById(Long id) throws TagException;
    DeleteTagResponse deleteTagById(Long id) throws TagException;
    UpdateTagResponse updateTagDetails(Long id, UpdateTagRequest updateTagRequest) throws TagException;
}

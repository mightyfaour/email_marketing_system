package com.philip.email_marketing_system.services.service;

import com.philip.email_marketing_system.DTOs.TemplateDto;
import com.philip.email_marketing_system.data.model.templateObject.Templates;

import java.util.List;

public interface TemplateService {
    TemplateDto createTemplate(TemplateDto templateDto);
    List<TemplateDto> getAllTemplates();
    TemplateDto getTemplateById(Long id);
    void deleteTemplateById(Long id);
    TemplateDto updateTemplate(Long id, TemplateDto templateDto);
}


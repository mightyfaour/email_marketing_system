package com.philip.email_marketing_system.services.serviceImpl;

import com.philip.email_marketing_system.DTOs.TemplateDto;
import com.philip.email_marketing_system.data.model.templateObject.Templates;
import com.philip.email_marketing_system.data.repositories.TemplateRepository;
import com.philip.email_marketing_system.exception.ResourceNotFoundException;
import com.philip.email_marketing_system.services.service.TemplateService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TemplateServiceImpl implements TemplateService {
    private final TemplateRepository templateRepository;

    @Override
    public TemplateDto createTemplate(TemplateDto templateDto) {
        Templates templates = new Templates();
        BeanUtils.copyProperties(templateDto, templates);
        templates.setCreatedAt(LocalDateTime.now());
        templates.setUpdatedAt(LocalDateTime.now());
        Templates savedTemplates = templateRepository.save(templates);
        BeanUtils.copyProperties(savedTemplates, templateDto);
        return templateDto;
    }

    @Override
    public List<TemplateDto> getAllTemplates() {
        List<Templates> templatesList = templateRepository.findAll();
        return templatesList.stream().map(this::mapFromTemplateToDto).collect(Collectors.toList());
    }

    @Override
    public TemplateDto getTemplateById(Long id) {
        Templates templates = templateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Template with id: " + id + " doesn't exist"));
        return mapFromTemplateToDto(templates);
    }

    @Override
    public void deleteTemplateById(Long id) {
        templateRepository.deleteById(id);
    }

    @Override
    public TemplateDto updateTemplate(Long id, TemplateDto templateDto) {
        Templates templates = templateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Template with id: " + id + " doesn't exist"));
        templates.setName(templateDto.getName());
        templates.setSubject(templateDto.getSubject());
        templates.setContent(templateDto.getContent());
        templates.setUpdatedAt(LocalDateTime.now());
        Templates savedTemplates = templateRepository.save(templates);
        BeanUtils.copyProperties(savedTemplates, templateDto);
        return templateDto;
    }

    private TemplateDto mapFromTemplateToDto(Templates templates) {
        TemplateDto templateDto = new TemplateDto();
        BeanUtils.copyProperties(templates, templateDto);
        return templateDto;
    }
}

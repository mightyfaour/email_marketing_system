package com.philip.email_marketing_system.controllers;

import com.philip.email_marketing_system.services.EmailService;
import com.philip.email_marketing_system.services.EmailServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email-service")
public class EmailServiceController {

    @Autowired
    private EmailServiceFactory emailServiceFactory;

    @PostMapping("/{emailServiceName}/send-email")
    public ResponseEntity<String> sendEmail(@PathVariable String emailServiceName, @RequestBody Email email) {
        try {
            EmailService emailService = emailServiceFactory.getEmailService(emailServiceName);
            emailService.sendEmail(email);
            return ResponseEntity.ok("Email sent successfully using " + emailServiceName + " email service.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (EmailServiceException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}

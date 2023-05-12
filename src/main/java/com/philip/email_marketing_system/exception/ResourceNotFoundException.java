package com.philip.email_marketing_system.exception;

public class ResourceNotFoundException extends EmailMarketingException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, String emailMarketing) {
        super(message, emailMarketing);
    }
}

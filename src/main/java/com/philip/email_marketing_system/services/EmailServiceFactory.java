package com.philip.email_marketing_system.services;



public class EmailServiceFactory {
    public EmailService getEmailService(String emailServiceName) {
        switch (emailServiceName) {
            case "AWS":
                return new AWSMailService();
            case "Postmark":
                return new PostmarkMailService();
            case "SendGrid":
                return new SendGridMailService();
            case "Mailgun":
                return new MailgunMailService();
            default:
                throw new IllegalArgumentException("Invalid email service name: " + emailServiceName);
        }
    }
}
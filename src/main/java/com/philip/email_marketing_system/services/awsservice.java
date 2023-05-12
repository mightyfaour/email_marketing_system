package com.philip.email_marketing_system.services;

import jakarta.mail.Message;
import org.springframework.http.StreamingHttpOutputMessage;


import javax.print.attribute.standard.Destination;
import javax.swing.text.AbstractDocument;



public class AWSMailService implements EmailService {
    private final AmazonSimpleEmailService client = AmazonSimpleEmailServiceClientBuilder.standard().build();

    @Override
    public void sendEmail(String recipient, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withDestination(new Destination().withToAddresses(recipient))
                .withMessage(new Message()
                        .withBody(new StreamingHttpOutputMessage.Body()
                                .withHtml(new AbstractDocument.Content().withCharset("UTF-8").withData(body)))
                        .withSubject(new AbstractDocument.Content().withCharset("UTF-8").withData(subject)))
                .withSource("noreply@yourdomain.com");

        SendEmailResult result = client.sendEmail(request);
        System.out.println("Email sent to " + recipient + " with message ID " + result.getMessageId());
    }
}

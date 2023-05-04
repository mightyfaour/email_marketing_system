package com.philip.email_marketing_system.controllers;

import com.philip.email_marketing_system.data.model.campaign.Campaign;

public class Control {

    public void sendEmail(Campaign campaign) {
        // Code to send email using the specified email service provider
    }

    public class AWSControl extends Control {

        // Code to send email using AWS SES

    }

    public class PostmarkControl extends Control {

        // Code to send email using Postmark

    }

    public class SendgridControl extends Control {

        // Code to


    }

    public class MailgunControl extends Control {

        // Code to send email using Mailgun

    }

    public static class MailjetControl extends Control {

        // Code to send email using Mailjet

    }

    public class SMTPControl extends Control {

        // Code to send email using SMTP

    }

}
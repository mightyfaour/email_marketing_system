package com.philip.email_marketing_system.exception;

public class EmailMarketingException extends RuntimeException {

   private String emailMarketing;

   public EmailMarketingException(String message){
       super(message);
   }

   public  EmailMarketingException(String message, String emailMarketing){
       super(message);
       this.emailMarketing = emailMarketing;
   }
}

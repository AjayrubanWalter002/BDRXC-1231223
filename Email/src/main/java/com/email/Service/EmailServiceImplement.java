package com.email.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.email.Entity.EmailDetails;
import com.email.Interface.EmailService;
@Service
public class EmailServiceImplement implements EmailService{
   @Autowired
    JavaMailSender jms;
   
   private String sender;
   
   public String sendSimpleMail(EmailDetails details) {
	   try {
	   SimpleMailMessage mail=new SimpleMailMessage();
	   mail.setFrom(sender);
	   mail.setTo(details.getRecepient());
	   mail.setText(details.getMsgBody());
	   mail.setSubject(details.getSubject());
	   
	   jms.send(mail);
	   return "Mail sent Successfully";
	   }catch (MailException e) {
		e.printStackTrace();
		return "Error! Couldn't sent the mail";
	}
	  
   }

}

package com.email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.Entity.EmailDetails;
import com.email.Interface.EmailService;

@RestController
public class EmailController {
	
	 
	    @Autowired 
	    EmailService emailService;
	 
	    // Sending a simple Email
	    @PostMapping("/sendMail")
	    public String sendMail(@RequestBody EmailDetails details){
	        
	    	String sends = emailService.sendSimpleMail(details);
	 
	        return sends;
	    }
}

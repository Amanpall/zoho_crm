package com.zohocrm.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceIMPL implements EmailService {
	
	@Autowired
	private JavaMailSender EmailSender;

	@Override
	public void sendsimplemessage(String to, String subject, String text ) {
		  SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo(to); 
	        message.setSubject(subject); 
	        message.setText(text);
	        EmailSender.send(message);
		
		
	}

}

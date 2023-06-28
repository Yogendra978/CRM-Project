package com.zoho.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailservicesImpl implements EmailServices {

	@Autowired
	private JavaMailSender sender;
	
	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(message);
		
		sender.send(mail);
		
	}



}

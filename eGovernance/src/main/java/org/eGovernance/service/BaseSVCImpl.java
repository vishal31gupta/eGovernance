package org.eGovernance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class BaseSVCImpl implements BaseSVC{

	@Autowired
	private JavaMailSender javaMailSender;
	
	private SimpleMailMessage message=new SimpleMailMessage();
	
	@Override
	public boolean sendMail(String mailId, String sub, String text) {
		message.setTo(mailId);
		message.setSubject(sub);
		message.setText(text);
		javaMailSender.send(message);
		return true;
	}

	@Override
	public String getRandomString(int length) {
		StringBuilder sb=new StringBuilder();
		int index=0;
		String alphaNumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+"abcdefghijklmnopqrstuvwxyz"
				+"1234567890";
		
		for(int i=0;i<length;i++)
		{
			index=(int)(Math.random()*alphaNumericString.length());
			sb.append(alphaNumericString.charAt(index));
		}
		return sb.toString();
	}

}

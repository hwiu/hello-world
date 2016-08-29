package com.hxt.mailtest;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Sendmail {

	public static void main(String[] args) {
		String to = "kkhxt@foxmail.com";
		String host = "localhost";
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		
		Session session = Session.getDefaultInstance(properties);
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress());
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("this is the Subject Line");
			message.setText("This is actual message");
			Transport.send(message);
			System.out.println("sent message succesfully...");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}

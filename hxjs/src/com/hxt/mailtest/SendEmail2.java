package com.hxt.mailtest;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail2
{
   public static void main(String [] args)
   {
      // �ռ��˵�������
      String to = "1457533832@qq.com";

      // �����˵�������
      String from = "2879294320@qq.com";

      // ָ�������ʼ�������Ϊ localhost
      String host = "smtp.qq.com";  //QQ �ʼ�������

      // ��ȡϵͳ����
      Properties properties = System.getProperties();

      // �����ʼ�������
      properties.setProperty("mail.smtp.host", host);

      properties.put("mail.smtp.auth", "true");
      // ��ȡĬ��session����
      Session session = Session.getDefaultInstance(properties,new Authenticator(){
	    public PasswordAuthentication getPasswordAuthentication()
	    {
	     return new PasswordAuthentication("2879294320@qq.com", "hxt369"); //�������ʼ��û���������
	    }
	   });

      try{
         // ����Ĭ�ϵ� MimeMessage ����
         MimeMessage message = new MimeMessage(session);

         // Set From: ͷ��ͷ�ֶ�
         message.setFrom(new InternetAddress(from));

         // Set To: ͷ��ͷ�ֶ�
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));

         // Set Subject: ͷ��ͷ�ֶ�
         message.setSubject("This is the Subject Line!");

         // ������Ϣ��
         message.setText("This is actual message");

         // ������Ϣ
         Transport.send(message);
         System.out.println("Sent message successfully....from w3cschool.cc");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}
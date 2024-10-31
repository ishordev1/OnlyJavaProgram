package com.mail;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class App 
{
    public static void main( String[] args )
    {
 
	  	String message="Hi This is mail send from java program.";
    	String subject="testing";
    	String to="tharooishor@gmail.com";
    	String from="chyraj@gmail.com";
    	
    //	sendEmail(message,subject,to, from);	
    sendAttatch(message,subject, to ,from);
    }
    
    
    private static void sendAttatch(String message, String subject, String to, String from) {
    	//set important properties;
    	String host="smtp.gmail.com";
    	Properties p=System.getProperties();
    	p.put("mail.smtp.host", host);
    	p.put("mail.smtp.port", "465");
    	p.put("mail.smtp.ssl.enable", "true");
    	p.put("mail.smtp.auth", "true");
    	
    	//get Session object
    	Session s=Session.getInstance(p,new Authenticator() {
			@Override
//		encrypt-	devvnyvbiacdnelwcov
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("chyraj63@gmail.com","vnyvbiacdnelwcov");
			}
        	});
    	s.setDebug(true);
    	
    
    	//compose the message
    	MimeMessage m=new MimeMessage(s);
    	try {
    		m.setFrom(from);
    		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    	m.setSubject(subject);
    String path="E:\\icon\\add.png";
    MimeMultipart mimeMultipart=new MimeMultipart();

    //text
    //file
    MimeBodyPart textMime=new MimeBodyPart();
    MimeBodyPart fileMime=new MimeBodyPart();
    try {
    	textMime.setText(message);
    	
    	File file=new File(path);
    fileMime.attachFile(file);
    
    
    //adding massage and file in MimeMultipart
    mimeMultipart.addBodyPart(textMime);
    mimeMultipart.addBodyPart(fileMime);
    
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
    	Transport.send(m);
    	System.out.println("mail send successfully......");
//    	Thread.sleep(5000);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    
//    								another one	
    
    
    
    //text send only
    private static void sendEmail(String message, String subject, String to, String from) {
    	//set important properties;
    	String host="smtp.gmail.com";
    	Properties p=System.getProperties();
    	p.put("mail.smtp.host", host);
    	p.put("mail.smtp.port", "465");
    	p.put("mail.smtp.ssl.enable", "true");
    	p.put("mail.smtp.auth", "true");
    	
    	//get Session object
    	Session s=Session.getInstance(p,new Authenticator() {
			@Override
//		encrypt-	devvnyvbiacdnelwcov
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("chyraj63@gmail.com","devvnyvbiacdnelwcov");
			}
        	});
    	s.setDebug(true);
    	
    
    	//compose the message
    	MimeMessage m=new MimeMessage(s);
    	try {
    		m.setFrom(from);
    		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    	m.setSubject(subject);
    	m.setText(message);

    	Transport.send(m);
    	System.out.println("mail send successfully......");
//    	Thread.sleep(5000);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
}

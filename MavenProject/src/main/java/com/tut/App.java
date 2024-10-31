package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args ) throws IOException
    {
//        Session factory=new Configuration().configure().buildSessionFactory();
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	//create student
    	Student st=new Student();
    	st.setId(333);
    	st.setName("ishor"); 
    	st.setCity("jaipur");
    	System.out.println(st);
    	
    	
    	//creating  object of Address 
    	Address ad=new Address();
    	ad.setStreet("street1");
    	ad.setCity("Nepal");
    	ad.setOpen(true);
    	ad.setAddedDate(new Date());
    	ad.setX(324215);
    //Reading Image
    	FileInputStream fis=new FileInputStream("src/main/java/img.jpg");
    	byte[] data=new byte[fis.available()];
    	fis.read(data);// data come in this line 
    	ad.setImage(data);
    	
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(st);
    	session.save(ad);
    	tx.commit();
    	
    	session.close();
    	System.out.println("done");
    }
}

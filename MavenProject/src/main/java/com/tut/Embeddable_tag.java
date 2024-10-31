package com.tut;
import com.tut.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Cartificate;
public class Embeddable_tag {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	
	Student st=new Student();
	st.setName("Bikash");
	st.setId(90);
	st.setCity("VGU");
	Cartificate carti=new Cartificate();
	carti.setCourse("java");
	carti.setDuration("3 month");
	st.setCarti(carti);
	
	
	Student st2=new Student();
	st2.setName("Nabin");
	st2.setId(10);
	st2.setCity("dili");
	
	Cartificate cart=new Cartificate();
	cart.setCourse("sql");
	cart.setDuration(" 2month");
	st2.setCarti(cart);
	
	
	session.save(st);
	session.save(st2);
	tx.commit();
	factory.close();
	session.close();

	
}
}

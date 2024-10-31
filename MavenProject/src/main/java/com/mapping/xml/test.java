package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Person p=new Person(23, "Ram","Nepal","5675674333333");
		
		Session s = f.openSession();
		Transaction tx=s.beginTransaction();
		s.save(p);
		tx.commit();
		
		
		s.close();
		f.close();

	}
}

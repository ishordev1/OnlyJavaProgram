package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class SecondCacheExample {
	public static void main(String[] args) {

		Configuration cf=new Configuration();
		cf.configure();
		SessionFactory f=cf.buildSessionFactory();
		
		Session s=f.openSession();
		//first
		Student st=s.get(Student.class, 5);
		System.out.println(st);
		
		s.close();
		          
	Session s2=f.openSession();
	Student st2=s2.get(Student.class, 5);
	System.out.println(st2);
	s2.close();
	}
}

package com.critera;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;

public class CriteriaExample {
public static void main(String[] args) {
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	
	Criteria c=s.createCriteria(Student.class);

	
//	 how to filter
//	c.add(Restrictions.eq("table col","value"));
	c.add(Restrictions.eq("id",3));
	
//	if we have foraign key table link in the table then use like this
	
//	c.add(Restrictions.eq("carti.course", "java"));
	List<Student> st=c.list();
	for(Student stu:st) {
		System.out.println(stu);
	}
	
	s.close();
	
	
}
}

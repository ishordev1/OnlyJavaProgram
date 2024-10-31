package com.hql;
import com.tut.Student;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLExample {
public static void main(String[] args) {
	SessionFactory s=new Configuration().configure().buildSessionFactory();
    Session session=s.openSession();
	String query="from Student as p where p.city=:x and p.name=:n";
	Query q=session.createQuery(query);
	q.setParameter("x", "nepal");
	q.setParameter("n", "Dev");
	
	List<Student> lis=q.list(); 
	for(Student st:lis) {
		System.out.println(st.getName());
	}
	
	
	
	s.close();
}
}

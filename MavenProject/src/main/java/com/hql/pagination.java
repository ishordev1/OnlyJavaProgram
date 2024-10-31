package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class pagination {
public static void main(String[] args) {
	SessionFactory f= new Configuration().configure().buildSessionFactory();
    Session s=f.openSession();

  Query q=s.createQuery("from Student");
    

   q.setFirstResult(10);
   q.setMaxResults(5);
   List<Student> list=q.list();
    
   for(Student st:list) {
	   System.out.println(st.getId() +":"+st.getName());
   }
   
   
   
    
    s.close();
    f.close();
}

	
	
}

package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class stageDemo {
public static void main(String[] args) {
SessionFactory f=new Configuration().configure().buildSessionFactory();
	
	
	
//	creating object
	Student st=new Student(2,"piter", "wagodia");
    st.setCarti(new Cartificate("java course", "2 month"));
//student :Transient state
    
    Session s=f.openSession();
    Transaction tx=s.beginTransaction();
    s.save(st);
    //student:persistent state             ---> is asociated in database and Session
   st.setName("John");
    tx.commit();
   
    //Detached stated         not save in database but save in session
	st.setName("Devid");
	System.out.println(st.getName());
	Student st1=(Student) s.get(Student.class, 2);
	s.delete(st1.getName());;
	 s.close();
	 Student st2=new Student();
	 System.out.println(st2.getName());
	    

	
}
}

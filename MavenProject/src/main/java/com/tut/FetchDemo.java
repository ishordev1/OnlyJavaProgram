package com.tut;
import com.tut.Address;
import com.tut.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	

	for(int i=1;i<50;i++) {
		Student st=new Student();
		Cartificate cf=new Cartificate();
	st.setName("karan");
	st.setCity("wagodiya");
	st.setId(i);
//	st.setId(2);
	cf.setCourse("java");
	cf.setDuration("3 month");
	st.setCarti(cf);
	session.persist(st);
//	session.save(st);
	}
	

	tx.commit();
//	
//	Student st2=(Student)session.load(Student.class,9);
//	System.out.println(st2);
//	System.out.println(st2.getName()+st2.getCity());
//	
//	System.out.println();
//	Student st3=(Student)session.load(Student.class,9);
//	System.out.println(st3);
//	System.out.println(st3.getName()+st3.getCity());
	
	
	
//Address ad=(Address)session.load(Address.class, 2);
//	System.out.println(ad.getCity());
//	
	
	
	
	session.close();
	factory.close();
}
}

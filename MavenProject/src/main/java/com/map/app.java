package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class app {
public static void main(String[] args) {
//	Configuration cfg=new Configuration();
//	cfg.configure();
//	SessionFactory factory=cfg.buildSessionFactory();
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	Emp e1=new Emp();
	e1.setEmpId(34);
	e1.setName("Ram");
	
	
	Emp e2=new Emp();
	e2.setEmpId(35);
	e2.setName("Shyam");
	
	
	
	
	Project p1=new Project();
	p1.setPid(1);
	p1.setProjectName("chatboat");
	
	Project p2=new Project();
	p2.setPid(2);
	p2.setProjectName("java applaction");
	
	
	List<Emp> list1=new ArrayList<Emp>();
	list1.add(e1);
	list1.add(e2);
	
	
	List<Project> list2=new ArrayList<Project>();
	list2.add(p1);
	list2.add(p2);
	
	//assing project to employee
	e1.setProject(list2);
//	e2.setProject(list2);
	//assign employee to pryject
	p1.setEmps(list1);
//	p2.setEmps(list1);
	Session s=factory.openSession();
	Transaction tx=s.beginTransaction();
	
	s.save(e1);
	s.save(e2);
	s.save(p1);
	s.save(p2);
	tx.commit();
//	
	
	s.close();
	
}
}

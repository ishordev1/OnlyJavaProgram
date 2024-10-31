package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {
public static void main(String[] args) {
	SessionFactory f= new Configuration().configure().buildSessionFactory();
    Session s=f.openSession();

    NativeQuery nq=s.createSQLQuery("select *from student");
    
    List<Object[]> list=nq.list();
    
    for(Object[] ob:list) {
//    	System.out.println(ob[0] +":"+ob[2]+":"+ob[3]+":"+ob[4]);
    	
    	System.out.println(Arrays.deepToString(ob));
    }
    
    
    s.close();
    f.close();



}
}

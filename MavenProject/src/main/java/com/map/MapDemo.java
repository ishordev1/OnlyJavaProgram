package com.map;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	
	
	
	Question q1=new Question();
	q1.setQuestionId(1);
	q1.setQuestion("what is java?");
	
	//creating ans
	Answer ans=new Answer();
	ans.setAnswerId(1);
	ans.setAnswer("java is a programming language.");
    ans.setQ(q1);
	
	
    Answer ans1=new Answer();
	ans1.setAnswerId(2);
	ans1.setAnswer("programming language.");
    ans1.setQ(q1);
    
    Answer ans2=new Answer();
   	ans2.setAnswerId(3);
   	ans2.setAnswer("language.");
       ans2.setQ(q1);
       
       List<Answer> list=new ArrayList<Answer>();
       list.add(ans1);
       list.add(ans2);
       list.add(ans);
       
       q1.setAnswer(list);
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
session.save(ans);
session.save(ans1);
session.save(ans2);
session.save(q1);
tx.commit();
	
	
	
	
//	featch data
//	Question q=(Question) session.get(Question.class, 1);
//	System.out.println(q.getQuestion());
//	for(Answer a:q.getAnswer()) {
//		System.out.println(a.getAnswer());
//	}
	
//	
	
	session.close();
	
	
}
}

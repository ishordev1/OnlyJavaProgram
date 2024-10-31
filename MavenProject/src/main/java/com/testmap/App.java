package com.testmap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory f=cfg.buildSessionFactory();
	
	
	
	Question q=new Question();
	q.setQuestion("what is java?");
	q.setId(2);
	Answer ans=new Answer();
	ans.setAnsid(4);
	ans.setAnswer("java is ans programming language.");
//	ans.setQuestion(q);
	q.setAns(ans);
	
	
	
	
	Session s=f.openSession();
	Transaction tx=s.beginTransaction();
	s.save(q);
	s.save(ans);
	tx.commit();
	
Question ques=(Question) s.get(Question.class,2);
//	Answer an=(Answer) s.get(Answer.class, 4);
System.out.println(ques.getQuestion() + ques.getAns().getAnswer());
//System.out.println(an.getQuestion().getQuestion() + an.getAnswer());
	
	s.close();
}
}

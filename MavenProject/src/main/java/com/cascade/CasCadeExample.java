package com.cascade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CasCadeExample {
public static void main(String[] args) {
	Configuration cf=new Configuration();
	cf.configure();
	SessionFactory f=cf.buildSessionFactory();
	Session s=f.openSession();
	                                                                                    
	Question q1=new Question();
	q1.setQuestionId(3);
	q1.setQuestion("what is java?");
	Answer ans=new Answer(10,"1java is programming language.");
	Answer ans1=new Answer(11,"2java is programming language.");
	Answer ans2=new Answer(12,"3java is programming language.");
	List<Answer> list=new ArrayList<Answer>();
	list.add(ans);
	list.add(ans1);
	list.add(ans2);
	q1.setAnswer(list);
	Transaction tx=s.beginTransaction();
	
//	-------Normal save----
	
	
//	s.save(q1);
//	s.save(ans);
//	s.save(ans1);
//	s.save(ans2);
	
	
	//cascading save use before
	
//	put anotation in full access table ----->question has answer table list 
	//so put anotation in question
//	@OneToMany(mappedBy ="q",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
//eager not need to put
//then use
	
	
//	CasCading Save
	s.save(q1);
	 
	
	tx.commit();
	s.close();
	f.close();
	
}
}

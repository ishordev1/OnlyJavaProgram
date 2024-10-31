package com.testmap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name="ans_id")
int Ansid;
String answer;


//@OneToOne
//Question question;
//
//public Question getQuestion() {
//	return question;
//}
//public void setQuestion(Question question) {
//	this.question = question;
//}

public int getAnsid() {
	return Ansid;
}
public void setAnsid(int ansid) {
	Ansid = ansid;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Answer() {
	super();
}


}

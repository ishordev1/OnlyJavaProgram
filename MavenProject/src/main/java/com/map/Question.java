package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Question {
@Id
@Column(name="question_id")
private int questionId;
private String question;

@OneToMany(mappedBy ="q",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
private List<Answer> answer;


public Question() {
	super();
	// TODO Auto-generated constructor stub
}





public List<Answer> getAnswer() {
	return answer;
}


public void setAnswer(List<Answer> answer) {
	this.answer = answer;
}


public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}


}

package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Cartificate {
private String course;
private String Duration;


public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getDuration() {
	return Duration;
}
public void setDuration(String duration) {
	Duration = duration;
}
public Cartificate(String course, String duration) {
	super();
	this.course = course;
	Duration = duration;
}
public Cartificate() {
	super();
	// TODO Auto-generated constructor stub
}

}

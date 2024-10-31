package com.core.Collection.Inject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private List<String> phoneNum;
private Set<String> address;
private Map<String, String> course;

public List<String> getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(List<String> phoneNum) {
	this.phoneNum = phoneNum;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}
public Student(List<String> phoneNum, Set<String> address, Map<String, String> course) {
	super();
	this.phoneNum = phoneNum;
	this.address = address;
	this.course = course;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [phoneNum=" + phoneNum + ", address=" + address + ", course=" + course + "]";
}

}

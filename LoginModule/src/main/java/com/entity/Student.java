package com.entity;


public class Student {
int EnrollmentNo;
String Name;
String Email;
String Address;
String password;


public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public int getEnrollmentNo() {
	return EnrollmentNo;
}
public void setEnrollmentNo(int enrollmentNo) {
	EnrollmentNo = enrollmentNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public Student(int enrollmentNo, String name,String email, String address, String password) {
	super();
	EnrollmentNo = enrollmentNo;
	Name = name;
	Email=email;
	Address = address;
	this.password = password;
}
public Student(String name, String email, String address, String password) {
	super();
	Name = name;
	Email=email;
	Address = address;
	this.password = password;
}
public Student() {
	super();
}



}

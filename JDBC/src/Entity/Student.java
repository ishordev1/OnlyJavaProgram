package Entity;

public class Student {
int rollNo;
String Name;
String address;
String phoneNo;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}


public Student() {
	super();
}


public Student(String name, String address, String phoneNo) {
	super();
	Name = name;
	this.address = address;
	this.phoneNo = phoneNo;
}
public Student(int rollNo, String name, String address, String phoneNo) {
	super();
	this.rollNo = rollNo;
	Name = name;
	this.address = address;
	this.phoneNo = phoneNo;
}




}

package steroType.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("ishor")
private String name;
	@Value("23")
private int id;
	
	@Autowired
	@Qualifier("phone")
	private Phone phone;
	
public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public Student(String name, int id, Phone phone) {
	super();
	this.name = name;
	this.id = id;
	this.phone = phone;
}


public Student() {
	super();
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", phone=" + phone + "]";
}



}

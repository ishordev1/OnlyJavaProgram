package Stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
	@Value("ishor")
private String name;
	
@Autowired
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public User(String name, Address address) {
	super();
	this.name = name;
	this.address = address;
}
public User() {
	super();
}
@Override
public String toString() {
	return "User [name=" + name + ", address=" + address + "]";
}


}

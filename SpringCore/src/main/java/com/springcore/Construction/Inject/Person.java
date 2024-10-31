package com.springcore.Construction.Inject;

public class Person {
private String name;
private int id;
private Address address;

public Person(String name, int id, Address ad) {
	this.name=name;
	this.id=id;
	this.address=ad;
}
public Person() {
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", address=" + address + "]";
}


}

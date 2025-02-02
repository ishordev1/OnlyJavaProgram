 package com.tut;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache (usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
private int id;
private String name;
private String city;
private Cartificate carti;

public Student(int id, String name, String city) {
	this.id = id;
	this.name = name;
	this.city = city;
}

public Cartificate getCarti() {
	return carti;
}

public void setCarti(Cartificate carti) {
	this.carti = carti;
}

public Student(String name, String city) {
	this.name = name;
	this.city = city;
}
public Student() {
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return this.id+":"+this.name+":"+this.city;
}


}

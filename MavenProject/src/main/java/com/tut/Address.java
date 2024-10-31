package com.tut;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="student_address")
public class Address {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="addressId")
private int address;
	//we can wrote name first or name last don't matter
	@Column(length=50,name="STREET")
private String street;
	
	@Column(name="city", length=100)
private String city;
	@Column(name="is_open")
private boolean isOpen;
	
	//not make column in table
	@Transient
private double x;
	
	@Column(name="added_date")
	//only date come not time
	@Temporal(TemporalType.DATE)
private Date addedDate;
	
	@Lob
private byte[] image;




public Address(int address, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
	this.address = address;
	this.street = street;
	this.city = city;
	this.isOpen = isOpen;
	this.x = x;
	this.addedDate = addedDate;
	this.image = image;
}



public Address() {
	super();
}



public int getAddress() {
	return address;
}
public void setAddress(int address) {
	this.address = address;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public Date getAddedDate() {
	return addedDate;
}
public void setAddedDate(Date addedDate) {
	this.addedDate = addedDate;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}





}

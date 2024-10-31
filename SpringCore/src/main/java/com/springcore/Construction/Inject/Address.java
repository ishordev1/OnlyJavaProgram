package com.springcore.Construction.Inject;

public class Address {
private String tempAddress;
private String perAddress;
public String getTempAddress() {
	return tempAddress;
}
public void setTempAddress(String tempAddress) {
	this.tempAddress = tempAddress;
}
public String getPerAddress() {
	return perAddress;
}
public void setPerAddress(String perAddress) {
	this.perAddress = perAddress;
}
public Address(String tempAddress, String perAddress) {
	super();
	this.tempAddress = tempAddress;
	this.perAddress = perAddress;
}
public Address() {
	super();
}
@Override
public String toString() {
	return "Address [tempAddress=" + tempAddress + ", perAddress=" + perAddress + "]";
}



}

package springCore.Property.Inj.Primative;

public class Student {
private int id;
private String Name;
private String Address;
private String phone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Student(int id, String name, String address, String phone) {
	super();
	this.id = id;
	Name = name;
	Address = address;
	this.phone = phone;
}
public Student(String name, String address, String phone) {
	super();
	Name = name;
	Address = address;
	this.phone = phone;
}
public Student() {
	super();
}


@Override
public String toString() {
	return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + ", phone=" + phone + "]";
}


}

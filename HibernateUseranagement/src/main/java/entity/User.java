package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ValueGenerationType;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int Id;
private String Name;
private String password;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User(int id, String name, String password) {
	super();
	Id = id;
	Name = name;
	this.password = password;
}
public User(String name, String password) {
	super();
	Name = name;
	this.password = password;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

}

package springCore.Reference.Inject;

public class Emp {
private String name;
private Phone phone;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Phone getPhone() {
	return phone;
}
public void setPhone(Phone phone) {
	this.phone = phone;
}
public Emp(String name, Phone phone) {
	super();
	this.name = name;
	this.phone = phone;
}
public Emp() {
	super();
}
@Override
public String toString() {
	return "Emp [name=" + name + ", phone=" + phone + "]";
}

}

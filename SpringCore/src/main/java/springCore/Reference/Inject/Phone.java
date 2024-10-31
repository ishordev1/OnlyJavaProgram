package springCore.Reference.Inject;

public class Phone {
private String number;

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public Phone(String number) {
	super();
	this.number = number;
}

public Phone() {
	super();
}

@Override
public String toString() {
	return "Phone [number=" + number + "]";
}




}

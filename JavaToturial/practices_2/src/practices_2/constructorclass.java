package practices_2;
class myemployee{
	private int id;
	private String name;
	
public	myemployee()
{
	id=5;
	name="Nitesh";
}
	
public	myemployee(String n, int v)
{
	id=v;
	name=n;
}

public int getid()
{
	return id;
}
public String getname()
{
	return name;
}
}                                                              
public class constructorclass {
	public static void main(String[] args) {
		myemployee e1=new myemployee();
//	myemployee e1=new myemployee("Nabin", 56456);

System.out.println(e1.getid());
System.out.println(e1.getname());

	}
}

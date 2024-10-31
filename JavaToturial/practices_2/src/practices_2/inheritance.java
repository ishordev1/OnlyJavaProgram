package practices_2;
class Animal{
	public int leg, ear;
public String name;
}
class Dog extends Animal{
	public void setdog(int Dl, int De)
	{
		leg=Dl;
		ear=De;
	}
	public void setname(String nam)
	{
		name=nam;
	}
	public String getname()
	{
		return name;
	}
}
public class inheritance {

	public static void main(String[] args) {
	Dog d1=new Dog();
	d1.setdog(4, 2);
System.out.println(d1.leg);
System.out.println(d1.ear);
d1.setname("dog");
System.out.println(d1.getname());
	}

}

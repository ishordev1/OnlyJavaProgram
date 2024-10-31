package practices_2;
class employee{
	private String name;
	private int salary;
	public void setname(String n)
	{
		name=n;
	}
	public String getname()
	{
		return name;
	}
public void setsalary(int sal)
{
	salary=sal;
}
public int getsalary()
{
	return salary;
}
}
public class getter_setter {

	public static void main(String[] args) {
		employee e1=new employee();
		e1.setname("ishor");
		System.out.println(e1.getname());
		
		e1.setsalary(89898);
		System.out.println(e1.getsalary());
		

	}

}

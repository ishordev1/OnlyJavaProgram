package practices_2;
class phone{
	public void phones(){
		System.out.println("this is phone");
	}
	 phone(int x)
	{
		System.out.println("overloded phone"+x);
	}
}
class smartphone extends phone
{
	public void phones()
	{
		System.out.println("this is smartphone");
	}
	smartphone(int x, int y)
	{
		super(x);
		System.out.println("this is overloaded"+y);
	}
}
public class construction {
public static void main(String[] args) {
smartphone sm= new smartphone(5,6);
sm.phones();
}
}

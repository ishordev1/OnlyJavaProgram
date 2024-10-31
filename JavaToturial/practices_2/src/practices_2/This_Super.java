package practices_2;
class A{
	int c;
	public A(int c)
	{
		this.c=c;
	}  
	public int getA() {
		return c;
	}
}
class B extends A{
	B(int d){
		super(d);
		System.out.println("constructor");
	}
}
public class This_Super {
	public static void main(String[] args) {
		B b=new B(5);
		System.out.println(b.getA());
		
		
}
}

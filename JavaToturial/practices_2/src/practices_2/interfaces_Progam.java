package practices_2;
interface AZ{
	void fun();
	void fun2();
	default void fun3() {
		System.out.println("happy holi");
	}
}
class BZ implements AZ{
	public void fun() {
		System.out.println("new world");
	}
	public void fun2() {
		System.out.println("my world");
	}
	
}
public class interfaces_Progam {
public static void main(String[] args) {
	BZ c1=new BZ();
	c1.fun3();
}
}

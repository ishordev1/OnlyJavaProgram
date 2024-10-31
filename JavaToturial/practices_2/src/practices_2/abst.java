package practices_2;
abstract class AB{
abstract void fun();
}
interface CD{
	void fun3();
	void run4();
}
  class Add extends AB implements CD{
	 void fun() {
		System.out.println("helo world");
	}
	public void fun3() {
		System.out.println("new hello");
	}
	public void run4() {
		System.out.println("jai shree ran");
	}

}
public class abst {
public static void main(String[] args) {
Add dd	=new Add();
dd.fun();
dd.run4();
dd.fun3();
}
}

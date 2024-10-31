//run time polymorfism --> overriding
//compile time polymorfism-->overloading

class test11{
	void fun() {
		System.out.println("hello");
	}
}
class test2 extends test11{
	void fun() {
		System.out.println("new world");
	}
	void fun(int a) {
		System.out.println(a);
	}
	void fun(int a, int b) {
		System.out.println(a+b);
	}
}
public class polymorfism {
public static void main(String[] args) {
	test11 obj=new test2();
	obj.fun();
	
}
}

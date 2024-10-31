class A{
	int a;
	int b=10;
	void setdata(int a) {
		this.a=a;
	}
	int getdata() {
		return a;
	}
	
	A(){
		System.out.println("Base class Constructor");
	}
}
class B extends A{
B(){
	super();
	System.out.println("Drive class constructor");
	super.setdata(2000);
	System.out.println(super.getdata());
System.out.println(super.b);
}
	
}
public class super_this {
public static void main(String[] args) {
	B obj=new B();
	
}
}

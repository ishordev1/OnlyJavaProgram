class test1{
	private int l, b;
	void setter(int l, int b) {
		this.l=l;
		this.b=b;
	}
	int getter() {
		int c=l*b;
		return c;
	}
}
class test5 extends test1{
	void fun2(int a,int b) {
		super.setter(a,b);
	}
}
public class super_method {
public static void main(String[] args) {
	test5 obj=new test5();
	obj.fun2(5, 6);
System.out.println(obj.getter());
}
}

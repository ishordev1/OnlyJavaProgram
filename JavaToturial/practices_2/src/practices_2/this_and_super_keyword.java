package practices_2;
class parent3{
protected int a=10;
parent3(int b){
	System.out.println("constructor in parent class"+b);
}
void call() {
	System.out.println("super class member");
}
}
class child3 extends parent3{
	child3 (int b) {
		super(b);
		System.out.println(b);
	}
	void callthis() {
		System.out.println(this);
	}
	
int a=20;
void call() {
	super.call();
	System.out.println(super.a);
	System.out.println(a);
}
}

public class this_and_super_keyword {
public static void main(String[] args) {
	child3 c1=new child3(39);
c1.call();
System.out.println(c1);
c1.callthis();
}
}

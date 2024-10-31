package practices_2;
interface parent{
	public static final int a=10;     // in all variable are present that keyword public static final
void ABC();
}
interface parent2{                         // class are also declear in default keyword
	void DEF();                            // default method are public + abstract
}
class child implements parent, parent2{
	public void ABC() {
		System.out.println("hello");
	}
	public void DEF() {
		System.out.println("World");
	}
}
public class interfaces {
public static void main(String[] args) {
//	parent p1=new parent();                    interface class has not create any object
	child aaa=new child();
	aaa.ABC();
	aaa.DEF();
	
}
}

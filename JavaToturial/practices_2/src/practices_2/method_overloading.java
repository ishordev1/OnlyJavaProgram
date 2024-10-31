//Method overloading means more than one same method in a single class with different parameter.

package practices_2;
class fun{
	void language(){
		System.out.println("nepali");
	}
	void language(String name) {
		String e=name;
		System.out.println(e);
	}
	void language(String a, String b) {
		String c=a;
		String d=b;
	System.out.println(c+d);
	}
}

public class method_overloading {
public static void main(String[] args) {
	fun method =new fun();
	method.language();
	method.language("English");
	method.language("Hidi");
}
}

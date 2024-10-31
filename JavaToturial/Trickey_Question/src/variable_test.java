
public class variable_test {
	int b;  // only access after object creation
	static int d;  // direction access with help of class name
public static void main(String[] args) {
	int a;
	// we cannot print without assigning a value in local variable;
//	System.out.println(a);     
	variable_test c=new variable_test();
	System.out.println(c.b);
	variable_test.d= d+d++;
	System.out.println(variable_test.d);
}
}

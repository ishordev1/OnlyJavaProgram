
public class nested_if_else {
public static void main(String[] args) {
	int a=10,b=2,c=100;

	if(a>b) {
		if(a>c) {
			System.out.println(" a is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}
	else {
		if(b>c) {
			System.out.println("b is greater.");
		}
		else {
			System.out.println("c is greater.");
		}
	}
}
}

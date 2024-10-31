package exception;



public class throw_keyword {
public static void main(String[] args) {
	
	int x=0, y=100;
	try {
	if(x<=0) {
//		throw new ArithmeticException("you cannot divide by zero");
//		throw new ArrayStoreException("lsla");
		throw new IllegalArgumentException("lsla");
	}
	int c=y/x;
	System.out.println(c);
	
	}
	

	
	catch(Exception e) {
//		System.out.println(e);
		System.out.println(e.getMessage());
	}
	
}
}

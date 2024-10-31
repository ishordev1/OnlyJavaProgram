
public class finally_keyword {
static int c;
 static int fun(int a, int b) {
		try {
		 c=a+b;
return c;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("finally");
		}
		return 0;	
	}
	public static void main(String[] args) {		
int a=5;
int b=0;
while(true) {
	try {
		System.out.println(a/b);
	}
	catch(Exception e) {
		System.out.println(e);
	break;
	}
	finally {
		System.out.println("program turminate.");
	}
	
}

		
	}
	
}

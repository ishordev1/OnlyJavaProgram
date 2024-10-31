
public class finally_met {

	
public static void main(String[] args) {
	while(true) {

		try {
			int c=5/0;
		}
		catch(Exception e) {
			System.out.println(e);
			
			
		}
//		finally {
//			System.out.println("program turminated");
//		}
		System.out.println("program end");
	}
}
}

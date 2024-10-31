package string_opration;
import java.util.Scanner;
public class string_print {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	
	while(true){
		System.out.println("Enter the student name:");
		String name=input.next();
		System.out.println("Enter the id");
		int id=input.nextInt();
		System.out.println("Enter your branch:");
		String b=input.next();
		
		System.out.println("Enter more record:");
		String ch=input.next();
		
		if(ch=="n") {
			System.out.println(name);
			break;
		}	
		System.out.println("Enter dadadadad");
		System.out.println(name);
	}

	
		
		
	
}
}

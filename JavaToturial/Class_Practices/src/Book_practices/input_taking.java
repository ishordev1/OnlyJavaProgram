package Book_practices;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class input_taking {
public static void main(String[] args) {

	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);

	try {
		System.out.println("Enter the name:");
		String input=br.readLine();
		System.out.println(input);
		
		System.out.println("Enter the number:");
		int n1=Integer.parseInt(input);
		
		
	}
	
	catch(Exception e) {
		System.out.println(e);
	}
}
}

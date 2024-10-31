import java.util.Scanner;
public class odd_or_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=input.nextInt();
		
		if(n1%2==0) {
			System.out.println(n1+"  is Even number");
		}
		else {
			System.out.println(n1+ " is odd number");
		}
		
		

	}

}

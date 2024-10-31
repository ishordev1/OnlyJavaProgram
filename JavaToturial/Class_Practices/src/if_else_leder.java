import java.util.Scanner;
public class if_else_leder {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner input=new Scanner (System.in);
System.out.println("Enter the number:");
n1=input.nextInt();
System.out.println("Enter the number:");
n2=input.nextInt();
System.out.println("Enter the number:");
n3=input.nextInt();

if(n1>n2 && n1>n3 )
{
	System.out.println("a is greater");
}
else if(n2>n1 && n2>n3)
{
System.out.println("n2 is greater.");
}
else {
System.out.println("n3 is greater.");
}

	}

}

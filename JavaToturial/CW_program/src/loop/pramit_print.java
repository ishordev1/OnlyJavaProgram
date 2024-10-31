package loop;

public class pramit_print {
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	System.out.println("Enter the number:");
	int n=input.nextInt();
	
	
	for(int i=1;i<=n;i++)
{
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1; k<=2*i-1; k++) {
			System.out.print("*");
		}
		System.out.println();
}
}
}

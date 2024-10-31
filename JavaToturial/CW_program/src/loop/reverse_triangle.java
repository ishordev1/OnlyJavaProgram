package loop;

public class reverse_triangle {
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	System.out.println("Enter the number:");
	int n=input.nextInt();
	for(int i=1;i<=n; i++) {
		for(int j=n-i; j>=0; j--) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
}

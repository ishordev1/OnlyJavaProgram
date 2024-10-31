package loop;

public class factorial {
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	System.out.println("Enter the number:");
	int n=input.nextInt();
	int fac=1;
	for(int i=1;i<=n; i++) {
		fac*=i;
	}
	System.out.println("factorial "+fac);
}
}

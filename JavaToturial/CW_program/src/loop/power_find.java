package loop;

public class power_find {
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	System.out.println("Enter the number:");
	int n=input.nextInt();
	int power=1;
	System.out.println("Enter the power number:");
	int p=input.nextInt();
	for(int i=1; i<=p;i++) {
		power*=n;
	}
	System.out.println(power);
}
}

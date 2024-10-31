import java.util.Scanner;
public class prime_number {
public static void main(String[] args) {
	int i, j=0, n;
	System.out.println("Enter the any integer number:");
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	for(i=1;i<=n; i++) {
		if(n%i==0) {
			j=j+1;
		}
		
	}
	if(j==2) {
		System.out.println("prime number:"+n);
	}
	else {
		System.out.println("Not a prime number is:"+n);
	}
}
}

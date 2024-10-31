package loop;

public class recatangular_pattern {
public static void main(String[] args) {
	
	java.util.Scanner input=new java.util.Scanner(System.in);
	System.out.println("Enter the number:row & column");
	int r=input.nextInt(), c=input.nextInt();
	
	for(int i=1;i<=r; i++) {
		for(int j=1;j<=c; j++) {
			if(i==1||i==r||j==1||j==c) {
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}

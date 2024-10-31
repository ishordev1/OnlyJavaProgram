package array_DSA;
import java.util.Scanner;
public class Deleate_with_value {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int a[]=new int[100];
	System.out.println("Enter the array number:");
	int n=input.nextInt();
	System.out.println("Enter the "+n+" element in array:");
	for(int i=0; i<n; i++) {
		a[i]=input.nextInt();
	}
	System.out.println("Enter the delete value:");
	int d=input.nextInt();
	int i;
		for(i=0;i<n; i++) {
			if(a[i]==d) {
				for(int j=i; j<n-1; j++) {
					a[j]=a[j+1];
				}
			break;
			}	
		}
		
	if(i<n) {
		System.out.println("your present array:");
		for( i=0;i<n-1; i++) {
			System.out.println(a[i]);
		}	
	}
	else {
		System.out.println(d+" not found in this list.");
		for( i=0;i<n; i++) {
			System.out.println(a[i]);
		}
	}
	
}
}

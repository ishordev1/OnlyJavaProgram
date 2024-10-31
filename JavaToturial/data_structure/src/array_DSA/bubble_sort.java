package array_DSA;
import java.util.Scanner;
public class bubble_sort {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int a[]=new int[100];
	System.out.println("Enter the array number:");
	int n=input.nextInt();
	System.out.println("Enter the "+n+"values in array:");
	int i,j;
	for(i=0; i<n; i++) {
		a[i]=input.nextInt();
	}
	for(i=0; i<n-1; i++) {
		for(j=0; j<n-1; j++) {
			if(a[j]>a[j+1]) {
				int swap=a[j];
				a[j]=a[j+1];
				a[j+1]=swap;
			}
		}
	}
	
	System.out.println("your sorted array:");
	for(i=0; i<n; i++) {
		System.out.println(a[i]);
	}
}
}

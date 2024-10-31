package data_structure;
import java.util.Scanner;

public class insertion_sorts {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i, min, j,n=4;
		
		int[] a=new int[100];
		
		for(i=0; i<5; i++) {
			System.out.println("Enter the value in "+ i +" position:");
			a[i]=input.nextInt();
		}
		
	try {
		for(i=1; i<n;i++) {
			min=a[i];
			j=i-1;
			while(j>=0 && a[j]>min) {
				a[j+1]=a[j];
				--j;
			}
			a[j+1]=a[j];
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
		
	}

}

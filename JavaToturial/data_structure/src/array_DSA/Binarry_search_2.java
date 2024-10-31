package array_DSA;
import java.util.Scanner;
public class Binarry_search_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int []a=new int[100];
		System.out.println("Enter the array Number:");
		int n=input.nextInt();
		System.out.println("Enter the "+n+" value in array:");
		for(int i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		System.out.println("Enter the search number:");
		int s=input.nextInt();
		
		int lr, up, mid;
		lr=0;
		up=n-1;
		mid=(lr+up)/2;
		while(lr<=up) {
			
			if(a[mid]<s) {
				lr=mid+1;
			}
			else if(a[mid]==s) {
				System.out.println(s+"found in "+ (mid+1)+ "location");
				break;
			}
			else
				up=mid-1;
			
			mid=(lr+up)/2;
		}
		
		if(lr>up) {
			System.out.println(s+" not found in array.");
		}
		
	}
}

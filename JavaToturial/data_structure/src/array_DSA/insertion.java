package array_DSA;
import java.util.Scanner;
public class insertion {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int a[]=new int[100];
	System.out.println("Enter array number:");
	int num=input.nextInt();
	System.out.println("Enter the "+num+ " value in array:");
	for(int i=0;i<num;i++) {
		a[i]=input.nextInt();
	}
	for(int i=0; i<num; i++) {
		System.out.println("your array"+a[i]);
			}
	System.out.println("Enter the insert value:");
	int v=input.nextInt();
	System.out.println("Enter the position number where you want to insert:");
	int p=input.nextInt();
	
	System.out.println();
	for(int i=num-1; i>=p-1; i--) {
	a[i+1]=a[i];
	}
	a[p-1]=v;
	
	for(int i=0; i<=num; i++) {
		System.out.println("your array:"+a[i]);
	}
}
}

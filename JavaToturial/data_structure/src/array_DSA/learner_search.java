package array_DSA;
import java.util.Scanner;
public class learner_search {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a[]=new int[100];
System.out.println("Enter the array number:");
int n=input.nextInt();
System.out.println("Enter the "+n+" array value:");
for(int i=0; i<n; i++) {
	a[i]=input.nextInt();
}
System.out.println("Enter the search value:");
int s=input.nextInt();
	for(int i=0; i<a.length; i++) {
		if(a[i]==s) {
			System.out.println(a[i]+" found in "+(i+1)+" position");
		}
	}
	}
}

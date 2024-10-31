package data_structure;
import java.util.Scanner;
public class learner_search {
	
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int []a= new int[100];
	int i, v,n;
	System.out.println("Enter array number");
	n=input.nextInt();
	
	System.out.println("Enter array value");
	for(i=0; i<n; i++) {
		a[i]=input.nextInt();
	}
	System.out.println("Enter search value:");
	v=input.nextInt();
	for(i=0; i<n; i++)
	{
		if(a[i]==v)
		{
			System.out.println(v +"\t is found in"+ i+"\tlocation");
			break;
		}
	}
	if(i>=n) {
		System.out.println(v +"\tis not found");
	}
}
}

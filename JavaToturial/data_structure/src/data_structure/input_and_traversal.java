package data_structure;
import java.util.Scanner;
public class input_and_traversal {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int []a=new int[100];
	int[]b=new int[100];
	System.out.println("Enter array number:");
	int n=input.nextInt();
	System.out.println("Enter the value in array:");
	for(int i=0; i<n; i++)
	{
		a[i]=input.nextInt();
	}
	
	for(int j=0; j<n; j++)
	{
		b[j]=a[j];
	}

for(int j=0; j<n; j++) {
	System.out.println(b[j]);
}
	}

}

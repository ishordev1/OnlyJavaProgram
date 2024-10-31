package data_structure;
import java.util.Scanner;
public class delection_with_value {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int []a= new int[100];
int n,i,d;
System.out.println("Enter the array number");
n=input.nextInt();
System.out.println("Enter the value in array");
for(i=0; i<n; i++)
{
	a[i]=input.nextInt();
}
System.out.println("Enter the value which you want to delete");
d=input.nextInt();
for(i=0; i<=n; i++)
{
	if(a[i]==d)
	{
		for(int j=i; j<n-1; j++ ) {
			a[j]=a[j+1];
		}
	}
}
for(i=0; i<n-1; i++)
{
	System.out.println(a[i]);
}

}
}

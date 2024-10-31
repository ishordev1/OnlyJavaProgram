package data_structure;
import java.util.Scanner;
public class insertion_with_position {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int []a=new int[100];
	int i, p, v;
	System.out.println("Enter the array number");
	int n=input.nextInt();
	
System.out.println("Enter value in array");
for(i=0; i<n; i++)
{
	a[i]=input.nextInt();
}
System.out.println("Enter which you want to insert number");
v=input.nextInt();
System.out.println("Enter the position number:");
p=input.nextInt();

for(i=n-1; i>=p+1; i--)
{
	a[i+1]=a[i];
}
for(i=0; i<n+1; i++)
{
	System.out.println(a[i]);
}
}
}

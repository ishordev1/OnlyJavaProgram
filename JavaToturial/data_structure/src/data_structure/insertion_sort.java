package data_structure;
import java.util.Scanner;
public class insertion_sort {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int []a=new int[100];
	int n,i, key, j;
	System.out.println("Enter the array number:");
	n=input.nextInt();
System.out.println("Enter the value in array");
for(i=0; i<=n-1; i++)
{
	a[i]=input.nextInt();
}
// Algorithm insertion sort => In this case the value is not swap value is sift
for(i=1; i<=n-1; i++)
{
key=a[i];
j=i-1;
while(j>=0 && a[j]>key)
{
a[j+1]=a[j];
j=j-1;
}
a[j+1]=key;
}
for(i=0; i<n; i++)
{
	System.out.println(a[i]);
}
}
}

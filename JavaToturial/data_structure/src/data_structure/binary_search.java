package data_structure;
import java.util.Scanner;
public class binary_search {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
//	int []a= new int[100];
int[] a= {5,6,3,9,2,10};
int n=a.length;
int s;
System.out.println("Enter search value:");
s=input.nextInt();



int lr=0, up=n-1, mid=(lr+up)/2;
while(lr<=up)
{
	if(a[mid]<s) {
		lr=mid+1;
	}
	else if(a[mid]==s)
	{
		System.out.println(s+" found in"+ (mid+1) +"location");
		break;
	}
	
	else 
		up=mid+1;
	mid=(lr+up)/2;	
	
}
if(lr>up)
{
	System.out.println(s+"is not found in array list.");
}
}
}

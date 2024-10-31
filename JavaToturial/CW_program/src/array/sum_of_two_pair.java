package array;

class z{
	int count_2_pair;
	void two_pair(int []b, int s,int target) {

	for(int i=0; i<s; i++)	{
		for(int j=i+1; j<s; j++)
		{
			if(b[i]+b[j]==target) {
				System.out.println(b[i]+"+"+b[j]+"="+target);
				count_2_pair++;
			}
		}
	}
	System.out.println("total 2 number of pair:"+count_2_pair);
	
	
	
	
	
	
	}
}


public class sum_of_two_pair {
public static void main(String []args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	int [] a=new int[100];
	System.out.println("Enter array size:");
	int s=input.nextInt();
	System.out.println("Enter the " +s+" value in array:");
	for(int i=0; i<s; i++) {
		a[i]=input.nextInt();
	}
	System.out.println("Enter, pair number:");
	int target=input.nextInt();
	
	
	z obj=new z();
	obj.two_pair(a,s,target);
	
}
}

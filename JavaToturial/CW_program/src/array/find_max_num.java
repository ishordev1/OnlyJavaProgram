package array;

public class find_max_num{
	static int max=Integer.MIN_VALUE;
	static void max(int []a,int size) {
		
		for(int i=0;i<size; i++) {
			
				if(a[i]>max) {
					max=a[i];
				
			}
			
		}
		System.out.println("your max value:"+max);
	}
	
	static void second_max(int []a,int size) {
	
		for(int i=0;i<size; i++) {
			if(a[i]==max) {
				a[i]=Integer.MIN_VALUE;
				
			}
		}
	}
	
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	int []a=new int[100];
System.out.println("Enter the size of array:");
int size=input.nextInt();
System.out.println("Enter value "+size+" in array:");
	for(int i=0; i<size; i++) {
		a[i]=input.nextInt();
	}
	
	max(a,size);
	second_max(a,size);
int max=Integer.MIN_VALUE;
	for(int i=0;i<size; i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("second max vlaue:"+max);
	
}

}

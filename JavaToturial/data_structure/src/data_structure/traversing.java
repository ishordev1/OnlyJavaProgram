package data_structure;
import java.util.Scanner;
public class traversing {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int i;
	int []a= new int[5];
	System.out.println("Enter the value in array:");
   for(i=0; i<5; i++)
   {
	  a[i]=input.nextInt();
   }
   for(int j:a)
   {
	   System.out.println(j);
   }
}
}

import java.util.Scanner;
public class Array_program {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int []a=new int[5];
System.out.println("Enter your sub marks:");
for(int i=0; i<5; i++) {
	a[i]=input.nextInt();
}
int total=0;
for(int i=0; i<5; i++) {
total +=a[i];
}
System.out.println("your total marks:"+total);
int avarage=total/5;
System.out.println("This is average value:"+ avarage);
int per=total/500*100;
System.out.println("your marks percentage :"+per);
}
}

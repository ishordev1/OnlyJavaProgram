import java.util.Scanner;

public class sum_of_digits {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int number, digit,sum=0;
System.out.println("Enter the number:");
number=input.nextInt();
while(number>0) {
	digit=number%10;
	sum=sum+digit;
	number=number/10;
}
System.out.println("sum of digit:"+ sum);

}
}

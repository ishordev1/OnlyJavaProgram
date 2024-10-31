package loop;

public class count_digit {
public static void main(String[] args) {
java.util.Scanner input=new java.util.Scanner(System.in);
System.out.println("Enter the number:");
int n=input.nextInt();
int count=0;
while(n>0) {
	count++;
	n=n/10;
}
System.out.println(count);
}
}

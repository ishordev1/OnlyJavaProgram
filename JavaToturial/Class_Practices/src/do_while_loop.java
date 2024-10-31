import java.util.Scanner;

public class do_while_loop {
public static void main(String[] args) {
	int pin=555;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter table number:");
	int n=input.nextInt();
	int i=1;
	do {
		System.out.println(n+"*"+"="+n*i);
		i++;
	}
	while(i<=10);
	
}
}

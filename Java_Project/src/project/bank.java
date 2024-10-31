package project;
import java.util.Scanner;
class bank_system{
	private double money=100;
	private int pass=123;
	void check_money() {
		System.out.println("Enter the password");
		Scanner input=new Scanner(System.in);
		int user_pass=input.nextInt();
		if(user_pass==pass)
		{
			System.out.println(money);
		}
		else {
			System.out.println("incorrect Password");
		}
	}
	void Deposite() {
		System.out.println("Enter the password");
		Scanner input=new Scanner(System.in);
		int user_pass=input.nextInt();
		if(user_pass==pass) {
			System.out.println("Enter Deposite Money");
			int user_money=input.nextInt();
		money=money+user_money;
		System.out.println("Deposite money:"+user_money);
		System.out.println("Total Money:"+ money);
		}
		else {
			System.out.println("incorrect Password");
		}
	}
 void take_money() {
	 System.out.println("Enter the password");
		Scanner input=new Scanner(System.in);
		int user_pass=input.nextInt();
	if(user_pass== pass) {
		System.out.println("Enter the amout of money which your want to take:");
		int user_money=input.nextInt();
		money=money-user_money;
		System.out.println("take money:"+user_money);
		System.out.println("Total Money:"+ money);
	}
	else {
		System.out.println("incorrect Password");
	}
		
	}
}
public class bank {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	bank_system aa=new bank_system();

while(true) {
	System.out.println("1. show money");
	System.out.println("2. Doposite money");
	System.out.println("3. Get0 money");
System.out.println("Enter your choice:");
int user_input=input.nextInt();
	switch(user_input)
	{
	case 1:aa.check_money();
	break;
	case 2:aa.Deposite();
	break;
	case 3:aa.take_money();
	break;
		
		default :{
			System.out.println("You can choose incorrect number:");
		}

	}
}
	
}
}

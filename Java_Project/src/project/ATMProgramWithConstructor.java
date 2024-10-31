package javaLab;
class A{
private	double TotalBalance=0;
private int pin=123;

//deposite money
void Deposite() {
	System.out.println("Enter the ammount:");
double money=new java.util.Scanner(System.in).nextInt();
TotalBalance+=money;
System.out.println("Your Balance is successfully added Rs:"+money);
}

//taking money
void withDraw() {
	System.out.println("Enter how much money you want to withdraw:");
	double money=new java.util.Scanner(System.in).nextInt();
	if(TotalBalance>=money) {
		TotalBalance-=money;
		System.out.println("Take your money: "+money);
		System.out.println("Your current Balance:"+TotalBalance);
	}
	else {
		System.out.println("Insufficient Balance.");
		System.out.println("Your account has only:"+TotalBalance+"Balance");
	}
}
//show money
void display() {
	System.out.println("Your Account has Only Rs:"+TotalBalance);
}

int validation() {
	System.out.println("Enter your Pin");
	int pin=new java.util.Scanner(System.in).nextInt();
	return pin;
}

public A() {
	int pin=validation();
	if(this.pin==pin) {
	while(true) {
		System.out.println("1:for Deposite money.");
		System.out.println("2: for withdraw money.");
		System.out.println("3: for show Total mony.");
		System.out.println("4: for exit.");
		int choice=new java.util.Scanner(System.in).nextInt();
		switch(choice) {
	
		case 1:{
			Deposite();
			break;
		}
		case 2:{
			withDraw();
			break;
		}
		case 3:{
			display();
			break;
		}
		case 4:{
			System.out.println("thank You  for using Our Services...");
			System.out.println("Have a Good Day...");
			System.exit(0);
		}
		default:{
			System.out.println("Invalid Input....! Please choose 1 to 3 number.");
			break;
		}
		}
	}
	}
	else {
		System.out.println("Invalid Pin. Please Enter correct pin");
		new test();
	}
	
}
	
}

public class ATMProgramWithConstructor {
public static void main(String[] args) {
	test obj=new test();
}
}

package project;
import java.util.Scanner;
public class electric_bill_calculator {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Your Unit=");
int unit=input.nextInt();
double unit_amount=0;
if(unit<=100) {
	unit_amount=unit*1.20;
}
else if(unit<=300) {
	unit_amount=100*1.20+(unit-100)*2;
}
else if(unit>300) {
	unit_amount=100*1.20+200*2+(unit-300)*3;
}

System.out.println("You can pay RS="+unit_amount +" for unit "+ unit);
}
}

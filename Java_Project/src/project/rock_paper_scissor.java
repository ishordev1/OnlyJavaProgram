package project;
import java.util.Random;
import java.util.Scanner;


public class rock_paper_scissor {
	Random getdata=new Random();
	static Scanner input=new Scanner(System.in);
	
	
	
public static void main(String[] args) {
rock_paper_scissor c1=new rock_paper_scissor();
	while(true) {
		System.out.println("-------------*****************-------------------");
		System.out.println("1. for play Game.");
		System.out.println("2. Exit game.");
		System.out.println("Enter your choice:");
		int ch=input.nextInt();
		switch(ch) {
		case 1:{
	c1.playgame();
	break;
		}
		case 2:{
			System.exit(0);
			break;
		}
		default:
			System.out.println("you choose Invalid number.");
			break;
		}
	}
}

void playgame() {
	System.out.println("Enter number:");
	System.out.println("0. for Paper.");
	System.out.println("1. for Scissor");
	System.out.println("2. for Rock.");
	int n1=input.nextInt();
	int bound=3;
	int cominput=getdata.nextInt(bound);

	if(n1==cominput) {
		System.out.println("-----------------*************-----------");
		System.out.println("Draw Game.");
	

	}
	else if(n1==2 && cominput==1 || n1==0 && cominput==2 || n1==1 && cominput==0) {
		System.out.println("-----------------*************-----------");
		System.out.println("Congratulation you Win.");
	

	}
	else {
		System.out.println("-----------------*************-----------");
		System.out.println("Computer Win game.");


	}
	if(cominput==0)
	{
		System.out.println("computer coice: Paper");
	}
	else if(cominput==1) {
		System.out.println("Computer coice: Scissor.");
	}
	else {
		System.out.println("Computer coice: Rock.");
	}
}
}

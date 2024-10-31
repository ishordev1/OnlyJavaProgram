package loop;
class A{
	void print(int n) {
		System.out.println(n);
	}
	
	void sum_num(int num) {
		int sum=0,rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum:"+sum);
	}
	
	
	void rev_num(int num) {
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("reverse:"+rev);
	}
}

public class input_sum {
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	System.out.println("Entern number:");
	int n=input.nextInt();
	A obj=new A();
	obj.sum_num(n);
	obj.rev_num(n);
	
	}
}

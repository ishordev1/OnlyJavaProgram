import java.util.Scanner;
class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int n=input.nextInt();
int i=1;
while(i<=10)
{
	System.out.println(n+"*"+"="+n*i);
	i++;
}
	}

}

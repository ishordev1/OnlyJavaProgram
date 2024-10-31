
public class switch_case {
public static void main(String[] args) {
	String a="+", b="-", c="*", d="/";
	System.out.println("Enter the operator");

	String op= new java.util.Scanner(System.in).nextLine();
	switch(op) {
	
	case "add":
	{
		System.out.println("add");
		break;
	}
	case "sub":
	{
		System.out.println("sub");	break;
	}
	case "div":
	{
		System.out.println("div");	break;
	}
	case "mul":
	{
		System.out.println("mul");	break;
	}
	default:
	{
		System.out.println("other");	break;
	}
	}
}
}

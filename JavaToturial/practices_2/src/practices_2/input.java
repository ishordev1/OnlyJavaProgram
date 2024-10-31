package practices_2;
import java.util.Scanner;
class circul{
	public int radius;
	public void setdata(int r)
	{
		radius=r;
	}
	public double getdata()
	{
		return Math.PI*radius*radius;
	}
}
public class input {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter circle radius");
	int b=input.nextInt();
	circul c1=new circul();
	c1.setdata(b);
	System.out.println(c1.getdata());
}
}

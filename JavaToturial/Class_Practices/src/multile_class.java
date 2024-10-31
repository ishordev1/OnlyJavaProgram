import java.util.Scanner;
class room{
	float length;
	float breath;
	void getdata(int a, int b) {
		length=a;
		breath=b;
	}
	
}
public class multile_class {
	public static void main(String[] args) {
		room m1=new room();
		m1.getdata(208, 6868);
		float area=m1.length*m1.breath;
		System.out.println(area);
	}

}

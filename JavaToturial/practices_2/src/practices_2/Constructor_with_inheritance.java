package practices_2;
class base{
	base()
	{
		System.out.println("Base class");
	}
	base(int z)
	{
		System.out.println("base"+z);
	}
}

class drive extends base{
	drive(){
		System.out.println("Drive class");
	}
	drive(int y, int z)
	{
		super(z);
		System.out.println("overloaded drive"+y);
	}
}
class drive1 extends drive{
	drive1(){
		System.out.println("Drive Drive class");
	}
	drive1(int x, int y, int z)
	{
		super(y,z);
		System.out.println("overloaded drive drive"+x);
	}
}

public class Constructor_with_inheritance {

	public static void main(String[] args) {
drive1 D1=new drive1();
drive1 D2 =new drive1(2,9,20);

	}

}

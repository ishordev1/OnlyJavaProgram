
class base{
	 private int a;
	base(int a){
		this.a=a;
	}
	void display() {
		System.out.println(a);
	}
}
class drive extends base{
private	int x,y;
	
	drive(int x, int y){
		super(x);
		this.x=x;
		this.y=y;
	}
	
//	void display()
//	{
//		System.out.println(x);
//		System.out.println(y);
//	}
	void show() {
		System.out.println(x);
System.out.println(y);
	}
}
public class construction_overloading_overriding_this_super {

	public static void main(String[] args) {
		drive obj=new drive(20,30);
		obj.display();
		
		

	}

}

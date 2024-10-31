package practices_2;
class cons{
	private int radius;
	private int height;
	public cons(int r, int h)
	{
	radius=r;
	height=h;
	}
	public int getheight() {
		return height;
	}
	public int getradius() {
		return radius;
	}

}
public class pr_9_constructor {

	public static void main(String[] args) {
		cons c1=new cons(5, 6);
		System.out.println(c1.getheight());
		System.out.println(c1.getradius());
		

	}

}

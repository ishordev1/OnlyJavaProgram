package practices_2;
class circle{
	public int radius;
circle(int r)
{
	radius=r;
}
public int getradius(){
	return radius;
}
public double area() {
	return Math.PI*radius*radius;
}
}

class cylinder extends circle
{
public int height;
cylinder(int h, int r){
	super(r);
	height=h;
}
public double volume() {
	return Math.PI*radius*radius*height;
}

}

public class area_of_circle_cons_inheritance {
public static void main(String[] args) {
	cylinder c1=new cylinder(5,6);
System.out.println(c1.area());
System.out.println(c1.volume());
}
}

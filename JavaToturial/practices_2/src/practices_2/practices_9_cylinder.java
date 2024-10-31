package practices_2;
class cylinderxyz{
	private int radius;
	private int height;
	
	public void setradius(int r)
	{
		radius=r;
	}
	public int getradius(){
		return radius;
	}
	public void setheight(int h)
	{
		height=h;
	}
	public int getheight()
	{
		return height;
	}
}

public class practices_9_cylinder {
public static void main(String[] args) {
cylinderxyz cy=new cylinderxyz();
cy.setradius(12);
System.out.println(cy.getradius());
cy.setheight(45);
System.out.println(cy.getheight());
	
	
}
}

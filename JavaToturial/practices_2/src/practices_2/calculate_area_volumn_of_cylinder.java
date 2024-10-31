package practices_2;
class cylinder12{
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

public class calculate_area_volumn_of_cylinder {
	public static void main(String[] args) {
		cylinder12 cy=new cylinder12();
		float pi=3.14f;
		cy.setradius(2);
		cy.setheight(5);
	float volumn;
	int ra=cy.getradius();
	int he=cy.getheight();
volumn=pi*(ra*ra)*he;
System.out.println("volumn of cylinder:"+volumn);
float area;
area=(2*pi*ra*he)+(2*pi*ra*ra);
System.out.println("area of cylinder "+area);
	}

}

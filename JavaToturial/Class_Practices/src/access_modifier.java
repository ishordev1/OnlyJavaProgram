class fun{
	int a;
	public int b;
	protected int c;
private int d;
	
}
class fun2 extends fun{
	public int e;
protected int f;
	private int g;
	int h;
}
class fun3 extends fun2{
	public int i;
protected int j;
	private int k;
	int l;
}
class fun4 extends fun3{
	void setter(int x) {
		e=x;
	}
	int gatter() {return c;}
}

public class access_modifier {
public static void main(String[] args) {
	fun4 obj=new fun4();
	obj.setter(55);
System.out.println(obj.gatter());
}
}

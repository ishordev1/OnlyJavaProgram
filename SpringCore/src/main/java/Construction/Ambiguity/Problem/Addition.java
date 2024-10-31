package Construction.Ambiguity.Problem;

public class Addition {
private int a;
private int b;
 

public Addition(double a, double b) {
	this.a=(int) a;
	this.b=(int) b;

System.out.println("this is double constructor");
}


public Addition(int a, int b) {
	this.a=a;
	this.b=b;
	System.out.println("this is int constructor");
}
@Override
public String toString() {
	return "Addition [a=" + a + ", b=" + b + "]";
}


}

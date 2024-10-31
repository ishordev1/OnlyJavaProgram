abstract class animals{
	int a=5;
	abstract void eat(String a );
	abstract void hair(String b);
	abstract void leg(String c);
}

//abstract
 class cat extends animals{
	void eat(String a) {
		System.out.println(a);
	}
void hair(String b) {
		System.out.println(b);
	}
void leg(String c) {
		System.out.println();
	}
//abstract void drink();
}




public class inheritance {
public static void main(String[] args) {
	cat c1=new cat();
	c1.eat("meat");
	c1.hair("black");
	c1.leg("four");
}
}

//In the abstraction method it is compasary to declear in first child body other wise error.
//It is not mandatray in abstract class to all method is abstract method.
//we can not create reference veriable in abstract class

package practices_2;
abstract class movies{
	int a=5;
	abstract void venom();
	abstract void spiderman();
}
class action extends movies{
	void venom(){
		System.out.println("gost");
	}
	void spiderman() {
		System.out.println("best");
	}
}

//class animation extends action{
//	void spiderman() {
//		System.out.println("best");
//	}
//}
public class abstraction {

	public static void main(String[] args) {
	action film= new action();
	film.venom();
System.out.println(film.a);
	}

}

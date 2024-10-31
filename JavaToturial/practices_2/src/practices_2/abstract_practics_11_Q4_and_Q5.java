package practices_2;
abstract class Telephone{
	abstract void ring();
	abstract void lift();
}
class smartphone2 extends Telephone{
	void ring() {
		System.out.println("ring......");
	}
	void lift() {
		System.out.println("lifting.......");
	}
	void camera() {
		System.out.println("click pictures");
	}
}
public class abstract_practics_11_Q4_and_Q5 {
public static void main(String[] args) {
	Telephone t1=new smartphone2();
	t1.ring();
	t1.lift();
//	t1.camera();        // In the superclass there are not found camera body so 
}
}

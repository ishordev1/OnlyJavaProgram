package practices_2;
abstract class pen{
	abstract void write();
	abstract void refil();
}
class fountainpen extends pen{
	void write() {
		System.out.println("Write");
	}
	void refil() {
		System.out.println("refil");
	}
	void fountingpen() {
		System.out.println("fountingpen");
	}
}
public class abstract_Practices_11_Q1_Q2 {
public static void main(String[] args) {
	fountainpen newpen=new fountainpen();
	newpen.write();
	newpen.refil();
	newpen.fountingpen();
}
}

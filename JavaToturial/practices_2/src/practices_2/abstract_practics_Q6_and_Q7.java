package practices_2;
interface tvremote{
	void remote1();
}
interface smartremote extends tvremote{
	void remote2();
}
class tv implements smartremote{
	public void remote1(){
		System.out.println("sony");
	}
	public void remote2() {
		System.out.println("Samsung");
	}
	void main() {
	System.out.println("It is main method");
}
}
public class abstract_practics_Q6_and_Q7 {
public static void main(String[] args) {
tv tvremote=new tv();
tvremote.remote1();
tvremote.remote2();
//abstract_practics_Q6.main();      we can not access main method in public class

tvremote.main();


}
//void main() {
//	System.out.println("It is main method");
//}
}

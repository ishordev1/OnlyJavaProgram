package practices_2;
class mythread extends Thread{

public void run() {
	for(int i=1; i<=1; i++){
	System.out.println("marvels");
	}
}
}
//class mythread2 extends Thread{
//
//public void run() {
//	for(int i=1; i<=10; i++) {
//	System.out.println("DC movies");
//	}
//}
//}
public class addition {

	public static void main(String[] args) {
	mythread t1=new mythread();
	t1.start();
	
//	mythread2 t2=new mythread2();
//	t2.start();
	
	Thread a1=Thread.currentThread();
	String tname=a1.getName();
	System.out.println("Name of running thread"+ tname);
	a1.setName("Rename thread");
	System.out.println(a1.getName());
	
	try {  
		Thread.sleep(5000);
		}
	catch(Exception r) {
		System.out.println("Program ended");
	   }
	System.out.println(a1.getId());
	}
}

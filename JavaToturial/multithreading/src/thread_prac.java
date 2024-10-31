class A extends Thread{
public	void run() {
		System.out.println("ello");
	}
}
class B implements Runnable{
	public void run() {
		System.out.println("world");
	}
}
public class thread_prac {
	public static void main(String[] args) {
		A t1=new A();
		B t2=new B();
		Thread t3=new Thread(t2);
	System.out.println(t1.getName());
	System.out.println(t1.getId());
t1.setName("Ram");
		System.out.println(t1.getName());
		t1.setPriority(Thread.NORM_PRIORITY);
		Thread t9=Thread.currentThread();
		System.out.println(t9);
		try {
			t1.sleep(5000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}

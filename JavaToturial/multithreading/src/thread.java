class mythread extends Thread{
public	void run() {
	for(int i=1; i<=100; i++) {
		System.out.println("hello");
	}
		
	}
}
class mythread9 implements Runnable{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("masti");
		}
	}
}
public class thread {
public static void main(String[] args) {
	mythread t1=new mythread();
	mythread9 t2=new mythread9();
	Thread t3=new Thread(t2);
	setPriority(t1.MIN_PRIORITY);
	try {
		t1.sleep(5000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	t1.start();
	t3.start();
	
	
}

private static void setPriority(int minPriority) {
	// TODO Auto-generated method stub
	
}
}

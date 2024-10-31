//2 way to create thread 
//to extends thread method
//to implements runnable intertface

class mynewthread extends Thread{
public	void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("extends thread");
		}
	}
}

class runnablethread implements Runnable{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("implements thread");
		}
	}
}

public class multi_threading_test {
public static void main(String[] args) {
	mynewthread t1=new mynewthread();
	System.out.println("id of thread"+t1.getId());
	t1.setName("Ishor");
	System.out.println(t1.getName());
//current thread
	Thread t9=Thread.currentThread();
	System.out.println(t9.getId());
	System.out.println(t9.getName());
	
	
//	runnable interface operation
	runnablethread t2=new runnablethread();
	Thread t3=new Thread(t2);
	System.out.println("id of runnable"+t3.getId());
	System.out.println(t3.getName());
	
	
	//Priority
	t1.setPriority(Thread.MIN_PRIORITY);
	
	//sleep thread
	try {
	t1.sleep(5000);	
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
	
}

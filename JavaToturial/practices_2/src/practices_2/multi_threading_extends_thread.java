package practices_2;
class mythread2 extends Thread{
public	void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i);
		}
	}
}
class mythread3 extends Thread{
	int i=0;

public void run() {
		while(i<100) {
			System.out.println("hello");
		
		i++;
		}
	}
}

public class multi_threading_extends_thread {
	public static void main(String[] args) {
		mythread2 t1=new mythread2();
		mythread3 t2=new mythread3();
		t1.start();
		t2.start();
		
	}

}

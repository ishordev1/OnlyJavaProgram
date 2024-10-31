package practices_2;
class thread extends Thread{
public void run() {
	for(int i=0; i<10; i++) {
		System.out.println("hello world");
	}
}
}
class thread2 extends Thread{
public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("new world");
		}
	}
}
public class multithread_extend_thread {
	public static void main(String[] args) {
		thread t1=new thread();
		thread2 t2=new thread2();
	t1.start();
	t2.start();
	}

}

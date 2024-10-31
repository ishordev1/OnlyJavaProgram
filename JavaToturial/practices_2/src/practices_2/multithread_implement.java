package practices_2;
class abc implements Runnable{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("3*"+i +"=" +3*i);
		}
	}
}
class cde implements Runnable{
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("hello world"); 
			
		}
	}
}
public class multithread_implement {
	public static void main(String[] args) {
		abc a1=new abc();
		Thread t1=new Thread(a1);
		t1.start();
		
		cde b1=new cde();
		Thread t2=new Thread(b1);
		t2.start();
		
	}

}

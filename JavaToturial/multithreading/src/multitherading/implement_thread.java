package multitherading;
class mythread4 implements Runnable{
	public void run() {
		int a=0;
		while(a<100) {
			System.out.println(a);
		a++;}
	}
}
class mythread5 implements Runnable{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("hello nepal");
		i++;}
	}
}
public class implement_thread {
public static void main(String[] args) {
	mythread4 myt4=new mythread4();
Thread t1=new Thread(myt4);
t1.start();
mythread5 myt5=new mythread5();
Thread t2 =new Thread(myt5);
t2.start();

}
}

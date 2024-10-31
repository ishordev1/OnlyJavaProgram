class AB extends Thread{
public	void run() {
	for(int i=1;i<=200; i++)
		System.out.println("hello thread");
	}
}
class BB implements Runnable{
	public void run() {
		for(int i=1;i<=200; i++)
		System.out.println("Runnable thread");
	}
}
public class multi_threadings {
	public static void main(String[] args) {
		AB obj=new  AB();
		try {
			obj.join();
			obj.start();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	String name=obj.getName();
	System.out.println("This is extends thread :"+name);
		BB obj2=new BB();
		Thread thobj=new Thread(obj2);
//		thobj.start();
		
		System.out.println("this is implements runnable="+	thobj.getName());
thobj.setName("Ishor");
System.out.println(thobj.getName());
System.out.println(thobj.getId());
 
try {
	thobj.sleep(5000);
	thobj.start();
}
catch(Exception c){
	System.out.println("Ended threads.");
}
;
	}

}

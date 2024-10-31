package collection;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_test{
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("Nitesh");
		a.set(0,"Nabin");
		a.add(1, "Bimlesh");
		a.add("ishor");
		a.remove("ishor");
		System.out.println(a);
		a.clear();
		System.out.println(a);
		ArrayList t1=new ArrayList<>();
	t1.add(5);
	t1.add(15);
	t1.add(20);
	t1.add(25);
	t1.add(35);
	t1.add(222);
	Collections.sort(t1);
	System.out.println(t1);
	System.out.println(t1.get(1));
	System.out.println(t1.size());
int index=Collections.binarySearch(t1,20);
System.out.println(index);
System.out.println(t1.containsAll(a));
	
	}
}
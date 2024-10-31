package collection;
import java.util.LinkedList;
import java.util.Collections;
public class op_collection {
public static void main(String[] args) {
	LinkedList a=new LinkedList<>();
	a.add("hello");
	a.add(998);
	a.add(53.34);
	a.set(1, 7676);
	a.remove(0);
	System.out.println(a);
	System.out.println(a.get(1));
	
}
}

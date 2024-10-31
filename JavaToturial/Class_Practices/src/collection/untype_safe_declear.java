package collection;
import java.util.ArrayList;
public class untype_safe_declear {
public static void main(String[] args) {
	
	//untype safe
	ArrayList name=new ArrayList<>();
	name.add("Nitesh");
	name.add(1234);
	name.add(535236254);
	name.add(8797878.4532);
	System.out.println(name);
	System.out.println(name.get(0));
	name.set(0, "Bimlesh");
	System.out.println(name.get(0));
	name.add(0,"Nabin");
	System.out.println(name.get(0));
	
}
}

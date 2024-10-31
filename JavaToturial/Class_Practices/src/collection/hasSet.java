package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hasSet {
public static void main(String[] args) {
	HashSet<String> hasset=new HashSet<String>();
	hasset.add("ishor");
	
	hasset.add("nabin");
	hasset.add("Abishek");
	hasset.add("zadu");
	hasset.add("yadav");	
	hasset.add("dev");
	System.out.println(hasset);
	
//	traverse
//	hasset.forEach(e->System.out.println(e));
	//	for(String st:hasset) {
//		System.out.println(st);
//	}
//	Iterator<String> itr = hasset.iterator();
//	while(itr.hasNext()) {
//		String s=itr.next();
//	System.out.println(s);
//	}
	


	
}
}

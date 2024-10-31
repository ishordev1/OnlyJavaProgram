package string_opration;

import java.util.Arrays;

public class sort_using_Arrays {
public static void main(String[] args) {
	String [] a= {"nabin", "ishor","karan","bimlesh", "Ankush", "nitesh"};
	for(String n:a) {
		System.out.println(n);
	}
	System.out.println("your sorted array:..............");
	Arrays.sort(a);
for(String n:a) {
	System.out.println(n);
}
    
}
}

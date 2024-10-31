package array;
import java.util.Scanner;
public class string_palindrome_check {
public static void main(String[] args) {

	String name="abba";
	System.out.println(name);
	String rev="";
	for(int i=name.length()-1;i>=0;i--) {
		rev+=name.charAt(i);
	}
	System.out.println(rev);
	if(name.equals(rev)) {
		System.out.println("palidram");
	}
	else {
		System.out.println("not palidram");
	}
}
}

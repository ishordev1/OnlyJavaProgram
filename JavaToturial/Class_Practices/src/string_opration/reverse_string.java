package string_opration;

public class reverse_string {
public static void main(String[] args) {
	 String name="Nabin chaudhary";
	 String temp="";
	 
	 for(int i=name.length()-1; i>=0; i--) {
	 temp=temp+name.charAt(i);
	 }
	 System.out.println(temp);
}
}

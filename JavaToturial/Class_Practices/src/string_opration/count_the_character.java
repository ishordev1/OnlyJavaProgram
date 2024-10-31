package string_opration;

public class count_the_character {
	public static void main(String[] args) {
		
	
String a="Nepal";
int count=0;

for(int i=0;i<=a.length()-1; i++) {
	if(a.charAt(i)=='a')
	{
	count++;	
	}
}
System.out.println("Total character:"+ a.length());
System.out.println("repate number:"+ count);

	}
}

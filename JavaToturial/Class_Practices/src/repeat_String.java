
public class repeat_String {
public static void main(String[] args) {
String a="My name is Ishor kumar chaudhar. I am "
		+ ""
		+ "from jaipur in Nepal and I have a single laptop with 4 gB ram in the case the problem is created. Thank you";
int count=0;
for(int i=0; i<=a.length(); i++) {
	if(a.charAt(i)=='i') {
		count++;
	}
}
System.out.println(count);

}
}

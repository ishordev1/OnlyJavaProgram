package data_structure;

public class Reverse_String {
public static void main(String[] args) {
String name="Bimlesh";
int len=name.length();
String rev="";
System.out.println(len);
for(int i=len-1; i>=0; i--)
{
	rev=rev+name.charAt(i);
}
System.out.println(rev);
}
}

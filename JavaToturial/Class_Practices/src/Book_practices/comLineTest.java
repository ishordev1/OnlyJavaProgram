package Book_practices;

public class comLineTest {
public static void main(String[] args) {
	int count,i=0;
	String string;
	count=args.length;
	System.out.println("Number of argument"+count);
	while(i<count) {
		string=args[i];
		i=i+1;
		System.out.println(i+":"+"java is "+string+"!");
	}
}
}

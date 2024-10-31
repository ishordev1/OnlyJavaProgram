package practices;

public class practices_1 {
public static void main(String[] args) {

	//check palidrome or not
	//	String name="Thomas", rev="";
//	for(int i=name.length()-1;i>0;i--) {
//	rev+=name.charAt(i);
//	}
//System.out.println(rev.equals(name)?"palidrome": "not palidrome");

////	reverse digit
//	int num=12345,rev=0,rem;
//	while(0<num) {
//		rem=num%10;
//		rev=rev*10+rem;
//		num/=10;
//	}
//	System.out.println(rev);
	
	
//rectangle
	int n=5;
	for(int i=1;i<=5;i++ ) {
		for(int j=1;j<=5;j++) {
			if(i==1|| j==1|| i==5|| j==5) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}

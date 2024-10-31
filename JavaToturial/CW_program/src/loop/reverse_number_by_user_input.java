package loop;

public class reverse_number_by_user_input {
public static void main(String []args) {
	int n=123;
	
	int rem,sum=0;
	for(;n>0; n=n/10) {
		rem=n%10;
		sum=sum*10+rem;
	}
	System.out.println(sum);
}
}

package loop;

public class sum_following_series {
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	System.out.println("Enter the number:");
	int n=input.nextInt();
	int ans=0;
	for(int i=1;i<=n;i++) {
		if(i%2==0) {
			ans=ans-i;
		}
		else {
			ans+=i;
		}
	}
	System.out.println(ans);
}
}

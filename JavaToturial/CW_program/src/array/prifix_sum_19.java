package array;
class G{
	static void print(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}
	static int []prifixSum(int[]a ){
		for(int i=1;i<a.length;i++) {
//		a[i]=a[i-1]+a[i];
			a[i]+=a[i-1];
		}
		return a;
	}
	
	static void rangeToSum(int []a,int l,int r) {
		int[] b=prifixSum(a);
		int ans=b[r]-b[l-1];
	System.out.println(ans);
	}
	static void taking_input(int []a) {
		java.util.Scanner input=new java.util.Scanner(System.in);
		while(true) {
			System.out.println("Enter the l & r");
			int l=input.nextInt();
			int r=input.nextInt();
			rangeToSum(a,l,r);
		}
		
	}
	
}


public class prifix_sum_19 {
public static void main(String[] args) {
	int []a= {3,5,2,5};
	G.prifixSum(a);
	G.print(a);
	G.taking_input(a);
	
}
}

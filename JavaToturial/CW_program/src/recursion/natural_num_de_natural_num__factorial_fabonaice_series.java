package recursion;
class A{
	static void print(int []a) {
		for(int i=0;i<a.length; i++) {
			System.out.print(" "+a[i]);
		}
		}
	
	
	static void naturalNum(int n) {
		if(n==0) 
			return;
		naturalNum(n-1);
		System.out.println(n);
	}
	static void decreasingNaturalNum(int n) {
		if(n==0) {
				return;
		}
		System.out.println(n);
		decreasingNaturalNum(n-1);
	}
	
	static int fac(int n) {
		if(n==0) {
			return 1;
		}
		return n*fac(n-1);
	}
	
	static int fab(int n) {
		if(n==0||n==1 ) {
			
			return n;
		}
		
		int ans= fab(n-1)+fab(n-2);
		return ans;
	}
	
}

public class natural_num_de_natural_num__factorial_fabonaice_series {
public static void main(String[] args) {
//	A.naturalNum(5);
//	A.decreasingNaturalNum(5);
//	System.out.println(A.fac(5));
for(int i=0;i<=10;i++) {
	System.out.println(	A.fab(i));
}
}
}

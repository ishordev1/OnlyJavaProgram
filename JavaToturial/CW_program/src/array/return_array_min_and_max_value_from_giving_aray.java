package array;

//import java.util.Arrays;

class B{
	static int[] fun(int []a) {
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
		
				}
			}
		}
		int[] ans= {a[0],a[a.length-1]};
	return ans;
	}
	static int[] fun2(int []a) {
		java.util.Arrays.sort(a);
		int []ans= {a[0],a[a.length-1]};
		return ans;
	}
	
}
public class return_array_min_and_max_value_from_giving_aray {
public static void main(String[] args) {
	int []a= {2,4,5,1,9,6};
	int []b=B.fun(a);
	System.out.println("smallest value:"+b[0]);
	System.out.println("largest value:"+b[1]);
	

	b=B.fun2(a);
	
}
}

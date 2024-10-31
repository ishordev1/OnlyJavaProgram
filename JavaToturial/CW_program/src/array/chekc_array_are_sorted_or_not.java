package array;

class y{
	static boolean isSorted(int []a) {
		boolean check=true;
		for(int i=1;i<a.length;i++) {
			if(a[i-1]<a[i]) {
			check=false;	
			break;
			}
		}
		return check;
	}
}
public class chekc_array_are_sorted_or_not {

	
public static void main(String[] args) {
	int []a= {1,2,5,6,9};
if(y.isSorted(a)==false) {
	System.out.println("array is not sored");
}
else {
	System.out.println("array is sorted.");
}

}
}

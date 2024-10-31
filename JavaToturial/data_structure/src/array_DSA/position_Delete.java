package array_DSA;

public class position_Delete {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int p=3;
	int n=5;
	for(int i=p-1; i<n-1; i++) {
		a[i]=a[i+1];
	}
	for(int i=0; i<n-1; i++) {
		System.out.println(a[i]);
	}
}
}

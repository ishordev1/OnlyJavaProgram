package array_DSA;

public class binary_search {
public static void main(String[] args) {
	int a[]= {2,4,6,9,12};
	int s=4;
	int n=5;
	int lr=0;
	int up=n-1;
	int mid=(lr+up)/2;
	
	while(up>=lr) {
		if(a[mid]<s) {
			lr=mid+1;
		}
		else if(a[mid]==s) {
			System.out.println(s+" found in "+(mid+1)+" position.");
			break;
		}
		else 
			up=mid+1;
		mid=(lr+up)/2;
	}
	if(lr>up) 
		System.out.println(s+ " is not found.");
	
}
}

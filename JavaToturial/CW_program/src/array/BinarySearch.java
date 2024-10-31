package array;

public class BinarySearch {
public static void main(String[] args) {
	int a[]= {5,6,7,8,9,10};
	int lr=0, up=a.length-1;
	int mid=(lr+up)/2;
	int s=11;
	while(lr<=up) {
		if(a[mid]<s) {
			lr=mid+1;
		}
		else if(a[mid]==s) {
			System.out.println("found");
		}
		else {
			up=mid+1;
		}
		mid=(lr+up)/2;
	}
	if(lr>up) {
		System.out.println("not found");
	}
}
}

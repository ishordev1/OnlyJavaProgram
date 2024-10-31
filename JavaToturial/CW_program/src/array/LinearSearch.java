package array;

public class LinearSearch {
public static void main(String[] args) {
	int a[]= {5,6,7,8,9,10};
	int s=1;
	boolean f=false;
for(int i=0;i<a.length;i++) {
	if(a[i]==s) {
		System.out.println("element found.");
		f=true;
	}
}
if(!f) {
	System.out.println("element not found.");
}

}
}

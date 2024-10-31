package array_DSA;

public class selection_sort {
public static void main(String[] args) {
	int a[]= {2,9,3,5,10,0};
	int n=6;
int min, i,j,swap;

for(i=0; i<n; i++) {
	min=i;
	for(j=i+1; j<n; j++) {
		if(a[min]>a[j]) {
			min=j;
		}
	}
		if(i!=min) {
			swap=a[i];
			a[i]=a[min];
			a[min]=swap;
		}	
}
System.out.println("your sorted array:");
for(int e:a) {
	System.out.println(e);
}
}
}

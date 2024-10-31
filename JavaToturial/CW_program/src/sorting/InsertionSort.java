package Sorting;

public class InsertionSort {
public static void main(String[] args) {
	int []arr= {10,4,5,3,4};

for(int i=1;i<arr.length;i++) {
	int key=arr[i];
	while(arr[i]>key && i>0) {
		arr[i+1]=arr[i];
		i=i-1;
	}
	arr[i+1]=key;
}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	
	}
}
}

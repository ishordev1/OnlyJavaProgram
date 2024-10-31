package array;
class F{
	static void print(int[] a) {
		System.out.println();
		System.out.println("your array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}
	


	static void swap(int []a,int left, int right) {
		int temp=a[left];
		a[left]=a[right];
		a[right]=temp;
	}
	
	static void zeroOneSort(int a[]) {
		int right=a.length-1;
		int left=0;
		while(left<right) {
			if(a[left]==1 && a[right]==0) {
				swap(a,left,right);
				left++;
				right--;
			}
			if(a[left]==0) {
				left++;
			}
			if(a[right]==1) {
				right--;
			}
		}
	}
	static void sortArrayByPrarity(int []a) {
		int left=0,right=a.length-1;
		while(left<right) {
			if(a[left]%2==1 && a[right] %2==0) {
				swap(a,left,right);
				left++;
				right--;
			}
			if(a[left]%2==0) {
				left++;
			}
			if(a[right]%2==1) {
				right--;
			}
		}
	}
	
	static int[] sortSquare(int []a){
		int left=0, right=a.length-1;
		int []ans=new int[a.length];
		int k=0;
		while(left<=right) {
			if(Math.abs(a[left])>Math.abs(a[right])) {
				ans[k++]=a[left]*a[left];
				left++;
			}
			else {
				ans[k++]=a[right]*a[right];
				right--;
				
			}
			
		}
		return ans;
	}
	
}
public class two_Pointer_18 {
public static void main(String[] args) {
//	int []a= {1,0,1,0,1,0,0,1,0};
	int []a= {-10,3,4,0};
	F.print(a);
//	F.zeroOneSort(a);
//	F.sortArrayByPrarity(a);
//	F.print(a);
	int [] b=F.sortSquare(a);
	F.print(b);
}
}

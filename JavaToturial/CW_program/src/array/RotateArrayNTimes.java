package array;
class I{
	static int[] rotate(int[]a,int rt) {
		rt=rt%a.length;
		int []ans=new int[a.length];
		int k=0;
		for(int i=a.length-rt;i<a.length;i++) {
			ans[k++]=a[i];
		}
		for(int i=0;i<a.length-rt;i++) {
			ans[k++]=a[i]; 
		}
		return ans;
		}
	static  void print(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
			
		}
	}
}
public class RotateArrayNTimes {
public static void main(String[] args) {
	int []a= {1,2,3,4};
	int []ans=I.rotate(a, 1);
	I.print(ans);
}
}

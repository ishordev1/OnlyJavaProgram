package pattern;
class A{
static void tringle(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	static void pat(int n) {
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			
			System.out.println();
		}
	}
	static void bn(int n) {
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				if(j%2==0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			
			System.out.println();
		}
	}
}
public class s_Alphabet {
public static void main(String[] args) {
	int n=5;
//	A.tringle(n);
//	A.pat(n);
	A.bn(n);
}
}

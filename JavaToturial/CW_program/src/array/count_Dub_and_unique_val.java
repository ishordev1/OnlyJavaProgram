package array;

public class count_Dub_and_unique_val {
public static void main(String[] args) {
	java.util.Scanner input=new java.util.Scanner(System.in);
	int count=0,unique_val=0;
	int []a=new int[100];
	int []b=new int[100];
	b=a.clone();
	System.out.println("Enter array size:");
	int n=input.nextInt();
	System.out.println("Enter "+n+"value in array:");
	for(int i=0; i<n; i++) {
		a[i]=input.nextInt();
	}
for(int i=0; i<n; i++) {
	for(int j=i+1;j<n; j++ ) {
		if(a[i]==a[j]) {
			System.out.println(a[i]+" present in"+i+" and "+j+" position");
			count++;
			a[i]=Integer.MIN_VALUE;
			a[j]=Integer.MIN_VALUE;
		}	
	}
}
for(int i=0;i<n;i++) {
	if(a[i]!=Integer.MIN_VALUE) {
		unique_val++;
	}
}

System.out.println("total Dublicate:"+count);
System.out.println("total unique:"+unique_val);
}
}

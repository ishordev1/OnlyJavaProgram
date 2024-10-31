package string_opration;


public class sort_string {
public static void main(String[] args) {
String str="ishordev";
char a[]=str.toCharArray();
char temp;
int i;

for(i=0; i<=a.length-1; i++) {
	for(int j=0; j<a.length-1; j++) {
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}

	}
}
	System.out.println(a);                         
	    
}
}

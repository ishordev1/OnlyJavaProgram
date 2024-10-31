package loop;

public class PrimeNumber {
public static void main(String[] args) {
int first=1,last=10;
while(first<=last) {
boolean prime=true;
	if(first<2) {
		first++;
		continue;
	}
	for(int i=2;i<=first/2;i++) {
		if(first%i==0) {
			prime=false;
		break;
		}
	}
	
	if(prime) {
		System.out.println(first);
	}
	first++;
}
}
}

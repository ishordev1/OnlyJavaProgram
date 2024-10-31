#include<stdio.h>
void main(){
	int n=0123,rev=0,rem=0;
	for(;n>0; n=n/10){
	rem=n%10;
		rev=rev*10+rem;
	}
	printf("reverse=%d",rev);
		
}

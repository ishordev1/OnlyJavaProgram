#include<stdio.h>
void main(){
	int a,b;
	printf("Enter the 2 number:");
	scanf("%d%d",&a,&b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("%d=a and %d=b ",a,b);
}

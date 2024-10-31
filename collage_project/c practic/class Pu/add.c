#include<stdio.h>
int fun(int a,int b){
	return a+b;
}
void main(){
	int a=5,b=10;
	int c=fun(a,b);
	printf(" addition of two number:%d",c);
}

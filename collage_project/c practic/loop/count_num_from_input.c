#include<stdio.h>
#include<conio.h>
int main(){
	int input=123434;
	int sumOfDigit=0;
	int org=input;
	while(input>0){
		
		sumOfDigit=sumOfDigit*10+input%10;
		input/=10;
		
	}
	printf("%d org value", org);
	printf("%d", sumOfDigit);
	return 0;
}

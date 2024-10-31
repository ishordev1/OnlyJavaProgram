#include<stdio.h>
#include<conio.h>
int main(){
	int input=123434;
	int sumOfDigit=0;
	while(input>0){
		
		sumOfDigit+=input%10;
		input=input/10;
		
	}
	printf("%d", sumOfDigit);
	return 0;
}

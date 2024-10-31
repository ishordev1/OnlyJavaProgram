#include<stdio.h>

int main(){
	int n, countOfDigits=0;
printf("Enter the number:\n");
scanf("%d", &n);
int orgn=n;

while(n>0){
	
	countOfDigits++;
	n=n/10;
	
}
printf("your original value:%d\n",orgn);
printf("count of digits are:\n %d", countOfDigits);
	getch();
	return 0;
}

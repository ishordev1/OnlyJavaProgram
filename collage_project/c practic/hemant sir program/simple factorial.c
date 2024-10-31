#include<stdio.h>
#include<conio.h>
 int main()
 {
 	int i, sum=1, n;
 	printf("enter the value:\n");
 	scanf("%d",&n);
 	for(i=1;i<=n;i++)
    {
	sum=sum*i;
	 } 	
	 printf("sum:%d", sum);
	 getch();
	 return 0;
 }
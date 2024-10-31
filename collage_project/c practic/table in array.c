#include<stdio.h>
#include<conio.h>
void main()
{
	int mul[100],j;
	printf("Enter the number=\n");
	scanf("%d",&j);
	for(int i=0;i<10;i++)
	{
	mul[i]=j*(i+1);
	}
	for(int i=0; i<10;i++)
	{
		printf("%d*%d=%d\n",j,i+i,mul[i]);
	}
	getch();
}
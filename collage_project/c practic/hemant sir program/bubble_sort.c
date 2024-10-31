#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5]={21, 9,5,113,-98}, i, j,swap;
		for(i=0; i<5; i++)
	{
		printf("your unsorted array= %d\n",a[i]);
	}
	for(i=0;i<5-1;i++)
	{
		for(j=0;j<5-1;j++)
		{
		if(a[j]>a[j+1])
		{
			int temp;
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
		}
	}
	for(i=0; i<5; i++)
	{
		printf("\n");
	}
	for(i=0; i<5; i++)
	{
		printf("your sorted array= %d\n",a[i]);
	}
	getch();
}
#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5]={21, 9,5,111,-98}, i, j,key;
		for(i=0; i<5; i++)
	{
		printf("your unsorted array= %d\n",a[i]);
	}
	
 for(i=1;i<5; i++)
 {
 key=a[i];
 j=i-1;
 while(j>=0 && a[j]>key)
 {
 	a[j+1]=a[j];
 	j=j-1;
	 }	
	 a[j+1]=key;
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
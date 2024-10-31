#include<stdio.h>
#include<conio.h>
void main ()
{
	int a[100],i,num,j,n;
	printf("Enter the arry number:\n");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("Insert value in array:\n");
	scanf("%d",&a[i]);
	}
	printf("Enter the number which you want to delete:\n");
	scanf("%d",&num);
	for(i=0;i<n;i++)
	{
		if(a[i]==num)
		{
			for(j=i;j<n;j++)
			a[j]=a[j+1];
		}
	}
	for(i=0;i<n-1;i++)
	{
		printf("\n a[%d]=%d",i,a[i]);
	}
	getch();
}
#include<stdio.h>
#include<conio.h>
int main()
{
	int a[100],n,p,i,v;
	printf("Enter array number:\n");
	scanf("%d",&n);
	printf("Enter %d number value in array\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter number which you want to insert\n");
	scanf("%d",&v);
	printf("Enter positiion of array where you want to insert:\n");
	scanf("%d",&p);
	
	for(i=n-1;i>=p-1;i--)
	{
		a[i+1]=a[i];
	}
	a[p-1]=v;
	
	printf("your insertion number:\n");
	for(i=0; i<n+1; i++)
	{
		printf("\n%d",a[i]);
	}
	getch();
	return 0;
}

#include<stdio.h>
#include<conio.h>
void main()
{ int n,v,p,a[100],i;
	printf("Enter the array number:");
	scanf("%d",&n);
	printf("Enter the value");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter the position:");
	scanf("%d",&p);
	printf("Enter the value:");
	scanf("%d",&v);
	for(i=n-1;i>=p-1;i--)
	{
		a[i+1]=a[i];
	}
	a[p-1]=v;
	for(i=0;i<=n;i++)
	{
		printf("%d",a[i]);
	}
	getch();
}
#include<stdio.h>
#include<conio.h>
int main()
{
	int a[100],i, n, v,p;
	printf("ENter the number:");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	printf("Enter the array value:");
	scanf("%d",&a[i]);
}
printf("Enter the position in where you want to delete");
scanf("%d",&p);
/*

printf("Enter the value :");
scanf("%d",&v);


for(i=n-1;i>=p-1;i--)
{
	a[i+1]=a[i];
}
a[p-1]=v;
*/
for(i=p;i<n;i++)
{
	a[i]=a[i+1];
}
for(i=0;i<n-1;i++)
{
	printf("%d",a[i]);
}
getch();
return 0;
}
#include<stdio.h>
#include<conio.h>
int main()
{
	int a[100], n,min,i,j;
	printf("Enter the array number:\n");
	scanf("%d",&n);
	printf("Enter %d number in array:\n",n);
	for(i=0; i<n;i++)
	{
		scanf("%d", &a[i]);
	}
	for(i=0;i<n;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[j]>a[min])
			{
				min=j;
			}
		}
		if(min!=i)
		{
			int temp;
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
	printf("your sorted array:\n");
	for(i=0; i<n;i++)
	{
		printf("\n%d",a[i]);
	}
	getch();
	return 0;
}
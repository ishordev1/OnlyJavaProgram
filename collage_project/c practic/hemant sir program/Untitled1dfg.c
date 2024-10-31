#include<stdio.h>
#include<conio.h>

void main()

{
	int a[100],n,s,i;
	
	printf("enter the number of elemeent");
	scanf("%d",&n);
	
	printf("enter the value of array");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		
		
		}	
	
	printf("enter the search number");
	scanf("%d",&s);
	
	
	int low=0,high=n-1,mid;
	
	while(low<=high)
	
	{
		
		mid=(low+high)/2;
		if(a[mid]<s)
		low=mid+1;
		else if (a[mid]>s)
		high=mid-1;
		else
		 printf("item found at location mid");

	}
	
printf("search unsuccessful");	
	
	getch();
}
#include<stdio.h>
#include<conio.h>
int main()
{
	int a[100], num, search, i , lr=0, up=num;
	int mid=(lr+up)/2;
	
	printf("Enter the array number:\n");
	scanf("%d",&num);
	printf("Enter %d element in array.",num);
	for(i=0; i<num; i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter search value:\n");
	scanf("%d", &search);
	
	while(lr<=up)
	{
	if(a[mid]<search)
	lr=mid+1;
	
	else if(a[mid]==search)
	{
		printf("%d is found in a[%d] location.", search, mid+1);
	}
	
	else                                                    
	mid=(lr+up)/2;                                          
	}
	if(lr>up)
	{
		printf("%d is not found.",search);
	}

	getch();
	return 0;
}
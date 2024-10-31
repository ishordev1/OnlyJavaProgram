#include<stdio.h>
#include<conio.h>
int main()
{
	int a[100], num, search, i;
	printf("Enter the array number:\n");
	scanf("%d",&num);
	printf("Enter %d number in array.",num);
	for(i=0; i<num; i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter search value:\n");
	scanf("%d", &search);
	
	for(i=0; i<=num; i++)
	{
	if(a[i]==search)
	{
		printf("%d is found in a[%d] location.\n", search, a[i+1]);
		break;
	}
	}
	if(i>num)
	{
		printf("\n %d is not found in array list.",search);
	}

	getch();
	return 0;
}
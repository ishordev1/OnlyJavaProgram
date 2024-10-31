#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5]={21, 9,5,111,-98}, i, j,key;
		for(i=0; i<5; i++)
	{
		printf("your unsorted array= %d\n",a[i]);
	}
	

	
	for(i=0; i<5; i++)
	{
		key=i;
		for(j=i+1; j<5; j++)
		{
			if(a[i]>a[j])
			{
				key=j;
			}
		}
		if(key !=i)
		{
			int swap;
			swap= a[key];
			a[key]=a[i];
			a[i]=swap;
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
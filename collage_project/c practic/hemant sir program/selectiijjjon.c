#include<stdio.h>
int main()
{
	int a[]={10,9,11,5};
	int n=4, i,j,key;
	for(i=1;i<n ;i++)
	{
		key=i;
		for(j+i;j<n-1;j++)
		{
			if(a[j]<a[key])
			{
				key=j;
			}
		}
		if(i!=key)
		{
			int temp;
			temp=a[i];
			a[i]=a[key];
			a[key]=temp;
		}
	}
	for(i=0;i<n;i++)
	{
	printf("%d\n",a[i]);
	}
	return(0);
}
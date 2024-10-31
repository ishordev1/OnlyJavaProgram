#include<stdio.h>
#include<conio.h>
void main()
{
	int i,f,n,l,s,mid,a[100];
	printf("Enter the array numb");
	scanf("%d",&n);
	printf("Enter %d number",n);
	for(i=0;i<n;i++)
	{
	scanf("%d",&a[i]);
	}
	printf("Enter the serch value");
	scanf("%d",&s);
	f=0;
	l= n - 1;
	mid=(f+l)/2;
	while(f<=l)
	{
		if(a[mid]<s)
	
		f = mid + 1;

		else if (a[mid]==s)
	{
			printf("%d found in %d loc",s,mid+1);
			break;
     }		
else
	l = mid - 1;
	mid=(f + l)/2;
} 
if(f>l)
printf("%d is not found",s);
getch();
}


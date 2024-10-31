#include<stdio.h>
void main(){
	int i,low,high,flag;
	printf("Enter the first and second num:\n");
	scanf("%d%d",&low,&high);
	while (low < high) {
flag = 0; // ignore numbers less than 2
if (low <= 1) {
++low;
continue;
}
for (i = 2; i <= low / 2; ++i)
{
if (low % i == 0)
{
flag = 1;
break;
}
}
if (flag == 0)
printf("%d ", low);
++low;
}

	
}

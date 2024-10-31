#include<stdio.h>
void main()
{
	int i,j,low, high, prime;
	scanf("%d%d",&low, &high);
	while(low<=high){
		prime=1;
		if(low<=1){
			i++;
			continue;
		}
		j=2;
		while(j<low){
			if(low%j==0){
				prime=0;
				break;
			}
			j++;
		}
		
		if(prime)
		printf("%d\t",low);
		low++;
	}
}

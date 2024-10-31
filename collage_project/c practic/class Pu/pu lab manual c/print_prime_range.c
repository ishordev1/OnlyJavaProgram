#include<stdio.h>
void main(){
	int i,low=10, high=20,j,prime;
	while(low<=high){
		prime=1;
		if(1>=low){
			prime=0;
			continue;
		}
		for(i=2;i<low/2;i++){
			if(low%i==0){
			prime=0;
			break;
			}
		
		}
		if(prime==1)
		printf("%d\t",low);
		low++;
		
	}
}

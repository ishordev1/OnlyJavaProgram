#include<stdio.h>
void main(){
	
	while(1)
	{
		int n,i,prime=0;
		printf("\nEnter any number:\n");
		scanf("%d",&n);
	
	for(i=1;i<=n;i++){
		if(n%i==0){
			prime++;
		}
	}
	if(prime==2){
		printf("prime");
	}
	else{
		printf("not prime");
	}
	}
}

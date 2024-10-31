#include<stdio.h>
void main(){
	int n1,n2,flag,i,j;
	printf("Enter 2 num:\n");
	scanf("%d%d",&n1,&n2);
	for(i=n1;i<=n2;i++){
		if(n1==1 || n1==0){
			continue;
		}
		flag=1;
		for(j=2;j<=i/2;j++){
			if(i%j==0){
				flag=0;
				break;
			}
		}
		if(flag==1){
			printf("%d\t",i);
			first++;
		}
	}
}

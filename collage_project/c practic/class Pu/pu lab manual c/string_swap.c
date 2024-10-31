#include<stdio.h>
void main(){
	int a[]={2,50,6,0};
	int *max,i,loc;
	max=a;
	*max=*a;
	for(i=1;i<4;i++){
		if(*(a+i)>*max){
			*max=*(a+i);
			loc=i+1;
		}
	}
	printf("%d value and %d loc",*max,loc);
}

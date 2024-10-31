#include<stdio.h>
void main(){
	int a[]={5,9,0,6,10,50};
	
	int i,len=6,min=a[0],loc;
	
	for(i=1;i<len;i++){
	if(a[i]<min){
		min=a[i];
	  loc=i+1;	
	}
	}
	printf("%d is min value. It found in %d location.",min,loc);
}

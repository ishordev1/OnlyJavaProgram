#include<stdio.h>
void main(){
	int a[]={20,1,10,50,9,0}, *max,loc,i;
	 max=a;
	*max=*a;
	for(i=1;i<6;i++){
	if(*(a+i)>*max)	{
		*max=*(a+i);
		loc=i+1;
	}	
	}
	printf("Max=%d found in loc: %d",*max,loc);
}

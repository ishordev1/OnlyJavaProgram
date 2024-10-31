#include<stdio.h>
#include<conio.h>
	int stack[5],top=-1,item;
void push();
void pop();
void show();
void main()
{
int ch;
	printf("1. for push\n");
	printf("2. for pop\n");
	printf("3. for show\n");
	printf("4. for close\n");
	

	while(1)
	{
		printf("enter the choice");
	scanf("%d",&ch);
	
	switch(ch)
	{
	
	case 1:
		push();
		break;
		
		case 2:
			pop();
			break;
			case 3:
				show();
				break;
	case 4:
		exit(0);
		break;
		default:
			printf("your are enter invalid number\n");
}
			getch();
		}
			
}
void push()
{
	if(top==5-1)
	{
		printf("stack is full");
	}
	else{
		printf("Enter the number in stack\n");
		scanf("%d",&item);
	top=top+1;
	stack[top]=item;
	}
}
void pop()
{
	if(top==-1)
	printf("stack is empty");
    else
    {
    	printf("poped stack %d\n",stack[top]);
    	top=top-1;
	}
}

void show()
{
	int i;
	if(top>=0)
	{
		printf("stack value:\n");
		for(i=top;i>=0;i--)
		{
			printf("\n%d",stack[i]);
		}
	}
		else
		{
			printf("stack is empty");
		}
	
}
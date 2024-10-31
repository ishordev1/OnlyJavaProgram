#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void Enqueue();
void Dequeue();
void Show();
int queue[5], f=-1, r=-1;
int main()
{
	int ch;
	printf("1. Enqueue.\n");
	printf("2. Dequeue.\n");
	printf("3. show.\n");
	printf("4. Exit.\n");
	while(1)
	{
	printf("\n 
	                                                                                                                       Enter your choice:\n");
	scanf("%d",&ch);
	switch(ch)
	{
	case 1:Enqueue();break;
	case 2: Dequeue();break;
	case 3: Show();break;
	case 4:exit(0);	
	}
   }
   getch();
   return 0;
}


void Enqueue()
{
	if(f==r+1)
	{
		printf("queue is full.\n");
	}
	else
	{
		if(f==-1)
		{
			f=0;
		}
		int item;
		printf("Enter element in queue:\n");
		scanf("%d",&item);
		r=r+1;
		queue[r]=item;
	}
}


void Dequeue()
{
if(f==-1)
{
	printf("Queue is empty.\n");
}
else
printf("%d is dequeue.\n", queue[f]);
f++;
if(f==r)
{
	f=-1;
	r=-1;
}
}


void Show()
{
	if(f==-1)
	{
		printf("queue is empty.\n");
	}
	else
	{
		printf("Queue element:\n");
		for(int i=f; i<=r; i++)
		{
			printf("\n%d",queue[i]);
		}
	}
}





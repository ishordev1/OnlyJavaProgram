#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void printList(struct Node* n)
{
	while (n != NULL)
	{
		printf(" %d ", n->data);
		n = n->next;
	}
}

struct node{
	int data;
	struct node* next;
};
int main()
{

//-------------------------linked list---------------

	struct Node* head = NULL;
	struct Node* second = NULL;
	struct Node* third = NULL;
	
	head = (struct Node*)malloc(sizeof(struct Node));
	second = (struct Node*)malloc(sizeof(struct Node));
	third = (struct Node*)malloc(sizeof(struct Node));
	
	head->data=5;
	head->next=second;
	
	second->data=9;
	second->next=third;
	
	third->data=8;
	third->next==NULL;
	 
printList(head);
	return 0;
}
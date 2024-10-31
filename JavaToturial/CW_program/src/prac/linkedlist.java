package prac;
class Node{
	int data;
	Node next;
	Node(int val)
	{
		data=val;
	}
}
class list{
	Node head=null;
	Node tail=null;
	int size=0;
	
	void insertAtFirst(int val) {
		Node temp=new Node(val);
		if(head==null) {
			head=temp;
			tail=temp;
			++size;
		}
		else {
			temp.next=head;
			head=temp;
			++size;
		}
	}
	
	void insertAtEnd(int val) {
		if(head==null) {
			insertAtFirst(val);
		}
		else {
			Node temp=new Node(val);
			tail.next=temp;
			tail=temp;
			++size;
		}
	}
	void insertAtIndex(int pos, int val) {
		if(pos==size+1) {
			insertAtEnd(val);
		}
		else if(pos==1) {
			insertAtFirst(val);
		}
		else if(pos>=0 || pos>size) {
			System.out.println("Invalid num");
		}
		else {
			Node t=new Node(val);
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			t.next=temp.next;
			temp.next=t;
			++size;	
		}
		
	}
	
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
		temp=temp.next;
		}
		System.out.println();
	}
	
	void displaySize() {
	
		System.out.println("Total size: "+size);
	}
	
	
	void deleteAtFirst() {
		head=head.next;
		--size;
	}
	void deleteAtEnd() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
		--size;
	}
	
	void deleteAtIndex(int pos) {
		if(pos==1) {
			deleteAtFirst();
		}
		else if(pos==size) {
			deleteAtEnd();
		}
		else if(pos==0 || pos>size ) {
			System.out.println("Invalid number.");
		}
		else {
			Node temp=head;
		for(int i=1;i<pos-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		--size;
		}
	}
	
	void getAtFirst() {
		System.out.println(head.data);
	}
	void getAtEnd() {
		System.out.println(tail.data);
	}
	void getAtIndex(int pos) {
		if(pos==1) {
			getAtFirst();
		}
		else if(pos==size) {
			getAtEnd();
		}
		else if(pos<=0 || size<pos) {
			System.out.println("invalid num");
		}
		else {
			Node temp=head;
			for(int i=1;i<pos;i++) {
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
}

public class linkedlist{
	public static void main(String[] args) {
		list obj=new list();
		obj.insertAtFirst(5);
		obj.insertAtFirst(10);
		obj.insertAtFirst(30);
	obj.display();
	obj.insertAtIndex(4, 9);
	obj.insertAtEnd(15);
obj.display();
obj.displaySize();
obj.deleteAtIndex(4);
obj.display();
obj.displaySize();
System.out.println(obj.head.data+" ="+obj.tail.data);
System.out.println("----------------------------------------------");
obj.getAtFirst();
obj.getAtEnd();
obj.getAtIndex(2);
System.out.println(obj.head.data+" ="+obj.tail.data);
	}
}
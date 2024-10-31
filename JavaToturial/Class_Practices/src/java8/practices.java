package java8;

import java8.Node.linkedList;
import java8.Node.show;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
	
	 static class linkedList{
		Node head=null;
		Node tail=null;
		void insertAtEnd(int value) {
			Node temp=new Node(value);
			if(head==null) {
				head=temp;
//				tail=temp;
			}
			else {
				tail.next=temp;
//				tail=temp;
			}
			tail=temp;
			
		}
	}
	
public static class show{
void show(Node n) {
	Node temp=n;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
}


	}


public class practices {
	public static void main(String[] args) {
	Node n1=new Node(5);
	Node n2=new Node(10);
	Node n3=new Node(150);
	Node n4=new Node(40);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
linkedList l=new linkedList();
l.insertAtEnd(30);
show s=new show();
s.show(n1);

}
}

package linkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class op{
	Node head=null;
	Node tail=null;
	int size=0;
	void addEnd(int val) {
		Node temp=new Node(val);
		if(head==null) {
			head=temp;
			tail=temp;
			size++;
		}
		else {
			tail.next=temp;
			tail=temp;
			size++;
		}
	}
	void addAtFirst(int val) {
		Node temp=new Node(val);
		if(head==null) {
			addEnd(val);
		}
		else {
			temp.next=head;
			head=temp;
			size++;
		}
	}
	
	void addAtIndex(int val, int pos) {
		Node t=new Node(val);
		if(head==null) {
			addAtFirst(val);
		}
		else if(size==0){
			addAtFirst(val);
		}
		else if(size<pos || size<0) {
			System.out.println("invalid pos");
		}
		else {
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			t.next=temp.next;
			temp.next=t;
			size++;
		}
	}
	
	void show() {

		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}

public class pra {
public static void main(String[] args) {
	op obj=new op();
	obj.addEnd(9);
	obj.addEnd(10);
	obj.addEnd(15);
	obj.addEnd(20);
	obj.show();
	obj.addAtIndex(2, 3);
	obj.show();
	
	System.out.println(obj.size);
	
}
}

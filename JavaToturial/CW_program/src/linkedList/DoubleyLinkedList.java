package linkedList;

class operation {
	Node head;
	Node tail;
	int size = 0;

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int val) {
			this.data = val;
		}
	}

	class Insert {
		void insertAtHead(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head= temp;
				tail = temp;
			}
			else {
				head.prev=temp; 
				temp.next = head;
				head=temp;
			}
			size++;
		}
		
		void insertAtTail(int val) {
			Node temp=new Node(val);
			if(head==null) {
				insertAtHead(val);
			}
			else {
				tail.next=temp;
				temp.prev=tail;
				tail=temp;
				size++;
			}
		}
		void insertAtIndex(int pos, int val) {
			if(pos==0) {
				insertAtHead(val);
			}
			else if(pos==size) {
				insertAtTail(val);
			}
			else if(pos<0 || pos>size) {
				System.out.println("invalid position");
			}
			else {
			
				Node t=head;
				for(int i=0;i<pos-1;i++) {
					t=t.next;
				}
				
				Node temp=new Node(val);
				temp.prev=t;
				temp.next=t.next;
				temp.next.prev=temp;
				t.next=temp;
				
				size++;
			}
		}
	}
	
	class Delete{
		void deleteAtHead() {
			head=head.next;
			head.prev=null;
			size--;
		}
		void deleteAtTail() {
			tail=tail.prev;
			tail.next=null;
			size--;
		}
		void deleteAtIndex(int pos) {
			if(pos==0) {
				deleteAtHead();
			}
			else if(pos==size) {
				deleteAtTail();
			}
			else if(pos<0 || pos>size) {
				System.out.println("Invalid position Not Possibe to Delete");
			}
			
			else {
				Node temp=head;
				for(int i=0;i<pos;i++) {
					temp=temp.next;
				}
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				size--;
				
			}
		} 
	}

	class Display {
		void displayWithHead() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		void displayWithTail() {
			Node temp = tail;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.prev;
			}
			System.out.println();
		}
		void displayWithIndex(int pos) {
			Node temp=head;
			for(int i=0;i<pos;i++) {
				temp=temp.next;
			}
			System.out.println(pos+" position Data:"+temp.data);
		}
	}
	
	}


public class DoubleyLinkedList {
	public static void main(String[] args) {
		operation op = new operation();
		operation.Display display = op.new Display();
		operation.Insert insert = op.new Insert();
		insert.insertAtHead(20);
		insert.insertAtHead(10);
		insert.insertAtHead(5);
		insert.insertAtTail(50);
		display.displayWithHead();
		System.out.println("head data:"+op.head.data);
		System.out.println("Tail data:"+op.tail.data);
		display.displayWithTail();
		System.out.println("Head previous:"+op.head.prev);
		System.out.println("Total size:"+op.size);
		display.displayWithHead();
		insert.insertAtIndex(1, 120);
		display.displayWithHead();
		System.out.println("Total size:"+op.size);
		display.displayWithTail();
		display.displayWithIndex(2);
		
		
		operation.Delete delete=op.new Delete();
//		delete.deleteAtHead();
		display.displayWithHead();
		System.out.println("delete call");
		delete.deleteAtIndex(2);
//	delete.deleteAtTail();
	display.displayWithHead();
	display.displayWithTail();
	System.out.println("head data:"+op.head.data);
	System.out.println("Tail data:"+op.tail.data);
	System.out.println("Total size:"+op.size);
	System.out.println("head prev:"+op.head.prev);
	System.out.println("Tail next:"+op.tail.next);
		
	}
}

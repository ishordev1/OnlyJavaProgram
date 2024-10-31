package linkedList;

import linkedList.linkedListCreate.delete;
import linkedList.linkedListCreate.display;
import linkedList.linkedListCreate.insert;

class linkedListCreate {
	Node head = null;
	Node tail = null;
	int size = 0;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public class insert {
		void insertAtEnd(int value) {
			Node temp = new Node(value);
			if (head == null) {
				head = temp;
				tail = temp;
				size++;
			} else {
				tail.next = temp;
				tail = temp;
				size++;
			}
		}

		void insertAtFirst(int value) {
			Node temp = new Node(value);
			if (head == null) {
				insertAtEnd(value);
			} else {
				temp.next = head;
				head = temp;
				size++;
			}

		}

		void insertAtIndex(int index, int value) {
			Node t = new Node(value);
			Node temp = head;

			if (index == size + 1) {
				insertAtEnd(value);
				return;
			} else if (index < 0 || index > size) {
				System.out.println("Invalid index");
				return;
			} else if (index == 0) {
				insertAtFirst(value);
				return;
			}

			for (int i = 1; i < index - 1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
			size++;

		}
	}

	class delete {
		void deleteAtFirst() {
			head = head.next;
			size--;
		}
		
		void deleteAtIndex(int index) {
			Node temp=head;
			if(index<=0 || size<index) {
				System.out.println("invalid index");
			}
			else if(index==1) {
				deleteAtFirst();
				return;
			}
			for(int i=1;i<=index-2;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
			tail=temp;
			size--;
		}
	}
	
	class display{
		void getAtFirst() {
		System.out.println(head.data);
		}
		void getAtLast() {
		System.out.println(tail.data);
		}
		void getAtIndex(int index) {
		Node temp=head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}

	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}

public class CreateDeleteGet {
	public static void main(String[] args) {
		linkedListCreate ll = new linkedListCreate();
		
		linkedListCreate.insert add=ll.new insert(); //without import
//		insert add = ll.new insert();    //	with import linkedListsCreate
		
		add.insertAtEnd(5);
		add.insertAtEnd(10);
		add.insertAtEnd(15);
		add.insertAtEnd(20);
	delete del=ll.new delete();
	ll.display();
	System.out.println(ll.size);
	del.deleteAtIndex(4);
	ll.display();
	System.out.println(ll.tail.data);
	display show=ll.new display();
	show.getAtIndex(1);
	}
}

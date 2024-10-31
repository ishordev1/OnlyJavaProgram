package practices;

class linkedList {
	Node head = null;
	Node tail = null;
	int size=0;

	public class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}

	class createLinkedList {
		void insertAtEnd(int value) {
			Node temp=new Node(value);
			if(head==null) {
				head=temp;
				tail=temp;
				++size;
			}
			else {
		tail.next=temp;
				tail=temp;
				++size;
			}
		}
		
		void insertAtFirst(int value) {
			Node temp=new Node(value);
			if(head==null) {
				insertAtEnd(value);
			}
			else {
				temp.next=head;
				head=temp;
				++size;
			}
		}
		
		void insertAtIndex(int index,int value) {
			Node temp=new Node(value);
			if(index==1) {
				insertAtEnd(value);
			}
			else {
				Node t=head;
			for(int i=1;i<=index-1;i++) {
				t=t.next;
			}
			temp.next=t.next.next;
			t.next=temp;
	++size;
			}
		}
	}
	
	
	class Delete{
		void deleteAtFirst() {
			head=head.next;
			--size;
		}
		void deleteAtLast() {
			Node temp=head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
			--size;
		}
		void deleteAtIndex(int index) {
			Node temp=head;
			for(int i=1;i<index-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
			--size;
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
Node temp=head;
		while(temp!=null) {
System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}

public class createDeleteGet {
	public static void main(String[] args) {
linkedList ll=new linkedList();
linkedList.createLinkedList c=ll.new createLinkedList();
linkedList.Delete d=ll.new Delete();
linkedList.display g=ll.new display();
c.insertAtFirst(10);
c.insertAtFirst(20);
c.insertAtFirst(30);
c.insertAtEnd(5);
System.out.println(ll.size+ " head:"+ll.head.data+" tail:"+ll.tail.data);
ll.display();
System.out.println();
g.getAtFirst();
g.getAtLast();
g.getAtIndex(3);
	}
}

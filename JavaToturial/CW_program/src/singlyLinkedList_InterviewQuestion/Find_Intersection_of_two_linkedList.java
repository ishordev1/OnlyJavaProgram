package singlyLinkedList_InterviewQuestion;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class Find_Intersection_of_two_linkedList {
	static void display(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	static int sizeOfLinkedList(Node head) {
		int size = 0;
		while (head != null) {
			size++;
			head = head.next;
		}
		return size;
	}

 static Node findInterSection(Node h1, Node h2) {
		int lengthA=sizeOfLinkedList(h1);
		int lengthB=sizeOfLinkedList(h2);
		
		Node tempA=h1;
		Node tempB=h2;
		if(lengthA>lengthB) {
			int n=lengthA-lengthB;
			for(int i=1;i<=n;i++) {
			tempA=tempA.next;	
			}
		}
		else{
			
			int n=lengthB-lengthA;
			for(int i=1;i<=n;i++) {
			tempA=tempA.next;	
			}
		}
		while(tempA!=tempB) {
			tempA=tempA.next;
			tempB=tempB.next;
		}
	return tempA;
	}


	public static void main(String[] args) {
		Node a1 = new Node(5);
		Node a2 = new Node(8);
		Node a3 = new Node(9);
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node n1 = new Node(35);
		Node n2 = new Node(37);
		a1.next = a2;
		a2.next = a3;
		a3.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		n1.next = n2;
		n2.next = d;
		display(a1);
		display(n1);
Node data=findInterSection(a1,n1);
//(5<0) ? System.out.println(data) : System.out.println("not found");
System.out.println((data!=null)? "found data:"+data.data:"not founnd");
	}
}

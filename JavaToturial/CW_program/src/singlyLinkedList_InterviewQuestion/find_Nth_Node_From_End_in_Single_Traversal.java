package singlyLinkedList_InterviewQuestion;

class Operation {
	Node head;
	Node tail;
	int size = 0;

	class Node {
		int data;
		Node next;

		Node(int val) {
			this.data = val;
		}
	}

	class Insert {

		void insertAtFirst(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = temp;
				tail = temp;
				size++;
			} else {
				temp.next = head;
				head = temp;
				size++;
			}
		}

		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if (head == null) {
				insertAtFirst(val);
			} else {
				tail.next = temp;
				tail = temp;
				size++;
			}
		}
	}

	class Display {
		void displayAll() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	class Question {
		// find the nth node from end of given linked list in single traversal
		void findNthNodeFromEndInSingleTraversal(int pos) {
			Node slow = head;
			Node fast = head;
			for (int i = 1; i <= pos; i++) {
				fast = fast.next;
			}
			while (fast != null) {
				slow = slow.next;
				fast = fast.next;
			}
			System.out.println(slow.data);
		}
	}
}

public class find_Nth_Node_From_End_in_Single_Traversal {
	public static void main(String[] args) {
		Operation op = new Operation();
		Operation.Insert insert = op.new Insert();
		Operation.Display display = op.new Display();
		Operation.Question q = op.new Question();
		insert.insertAtEnd(5);
		insert.insertAtEnd(10);
		insert.insertAtEnd(15);
		insert.insertAtEnd(20);
		insert.insertAtEnd(25);
		insert.insertAtEnd(30);
		display.displayAll();
		q.findNthNodeFromEndInSingleTraversal(2);

	}
}

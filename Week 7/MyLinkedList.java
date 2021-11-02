

/*******************
Name: Austin C Arledge

Date: 22 Jan 2021

Notes: No commands needed, just run "java MyClassList" in cmd in the root folder and read output
*******************/

// Java program for reversing the linked list

class MyLinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static MyLinkedList addNode(MyLinkedList l, int d) {
		
		// Make the next node
		Node node = new Node(d);
		node.next = null;
		
		// Check to see if there are any nodes in the list already
		if (l.head == null) {
			l.head = node;
		}
		
		else {
			
			// Find the last node & place the new node
			Node last = l.head;
			while (last.next != null) {
				last = last.next;
			}
			
			// Now put the newly created node in the last position
			last.next = node;
		}
		
		return l;
	}
	
	public static Node reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		// Recursive call
		Node reversedListHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return reversedListHead;
	}

	// prints content of double linked list
	public void printList(Node node) {
		
		System.out.print("Current Node list in order: ");
		
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		// Create a few objects to add to the linked list
		for (int n = 100; n < 110; n++) {
			list = addNode(list, n);
		}
		
		// Display our current list
		list.printList(head);
		
		// Reverse the list
		head = reverse(head);
		
		// Display the new list
		list.printList(head);
		
		// Reverse the list once again to show it works backwards
		head = reverse(head);
		
		// Display the new list
		list.printList(head);
	}
}
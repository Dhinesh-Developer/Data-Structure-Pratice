
class Node
{
	int data;
	Node next;
	
	// Constructor
	Node (int data)
	{
		this.data = data;
		this.next = null;
	}
}


// creating a class for the PrintLinkedList in correct way or efficient way.

class LinkedList
{
	public Node head;  // put public orther wise cannot access.

	void printLinkedList()
	{
		Node curr = this.head;
		while ( curr != null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}



public class linked_List_traversing_And_Display {

	public static void main(String[] args) {
		
		/*
		 * write a program to create a list and display the list from traversing the list .
		 * input get from node while creating a object for node ,  output = 10,20,30,40
		 */
 
		// creating a object for LinkedList
    LinkedList ll = new LinkedList();
    
    // creating a object for Node
    Node p1 = new Node(10);
    Node p2 = new Node(20);
    Node p3 = new Node(30);
    Node p4 = new Node(40);
    
    // changing node referring to the next node for the connecting to next node.
    p1.next = p2;
    p2.next = p3;
    p3.next = p4;
    
    // creating a instances variable for head ; referring a the first node connect to head
    ll.head = p1;
    ll.printLinkedList();

	}

}

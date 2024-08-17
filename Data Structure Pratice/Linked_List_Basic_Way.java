class Node{
	public static Node head;
	int data;
	Node next;
	Node(int data){
		this.data = data;  // assign data to data
		this.next = null;  // this optional . setting default node's next field is null
	}
}


public class Linked_List_Basic_Way {

	// print the node data.
	static void printLinkedList(Node head)
	{
		Node curr = head;  // local variable.
		while(curr != null)
		{
			System.out.println(curr.data);
			curr = curr.next;
			
		}
	}
	public static void main(String[] args) {
		
		// create a basic structure of linkedList.
		/*
		 * write a program to display the list using linkedList. input = 10,20,30,40  output = 10,20,30,40
		 */
		
		// create a object for the Node class
		Node p1 = new Node(10);
		Node p2 = new Node(20);
		Node p3 = new Node(30);
		Node p4 = new Node(40);
		
		p1.next = p2;  // assigning Node's next field address
		p2.next = p3;
		p3.next = p4;
		
		Node head = p1; // local variable 
		printLinkedList(head);
		
	}

}

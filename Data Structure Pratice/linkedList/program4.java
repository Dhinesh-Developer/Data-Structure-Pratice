package linkedList;


class Node3
{
	int data;
	Node3 next;
	public Node3(int data, Node3 next) {
		this.data = data;
		this.next = next;
	}
	public Node3(int data) {
		this.data = data;
		this.next = null;
	}
	
}
public class program4 {
	
	public static int printLL(Node3 head)
	{
		int count = 0;
		while(head != null)
		{
			count++;
			head = head.next;
		}
		return count;
	}

	public static void main(String[] args) {
		
		/*
		 * find the length of the LinkedList.
		 * output = Length of the Linked List: 4
		 */
		
		int[] ar = {2,1,3,4};
		Node3 head = new Node3(ar[0]);
		head.next = new Node3(ar[1]);
		head.next.next = new Node3(ar[2]);
		head.next.next.next = new Node3(ar[3]);
		
		int res = printLL(head);
		System.out.println("Length of the Linked List: "+res);

	}

}

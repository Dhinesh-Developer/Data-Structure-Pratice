package linkedList;

class Node2
{
	int data;
	Node2 next;
	public Node2(int data, Node2 next) {
		this.data = data;
		this.next = next;
	}
	public Node2(int data) {
		this.data = data;
		this.next = null;
	}
}

public class program3 {
	
	public static void printLL(Node2 head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node2 deleteTailNode(Node2 head)
	{
		if(head==null || head.next==null)
		{
			return null;
		}
		Node2 temp = head;
		if(temp.next.next!=null)
		{
			temp = temp.next;
		}
		temp.next =null;
		return head;
	}
	public static void main(String[] args) {
		
		int[] ar = {2,3,4,5};
		Node2 head = new Node2(ar[0]);
		head.next = new Node2(ar[1]);
		head.next.next = new Node2(ar[2]);
		head.next.next.next = new Node2(ar[3]);
		
		deleteTailNode(head);
		printLL(head);
	}

}

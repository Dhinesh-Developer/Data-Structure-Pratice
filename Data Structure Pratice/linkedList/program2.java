package linkedList;

import java.util.Arrays;
import java.util.List;

class Node1
{
	int data;
	Node1 next;

	public Node1(int data) {
		this.data = data;
		this.next = null;
	}

	public Node1(int data, Node1 next) {
		this.data = data;
		this.next = next;
	}
}
public class program2 {

	public static void printLL(Node1 head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	public static Node1 insertHead(int val,Node1 head)
	{
		Node1 temp = new Node1(val,head);
		return temp;
	}

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(10,20,30,40);
		int val = 100;

		Node1 head = new Node1(arr.get(0));
		head.next = new Node1(arr.get(1));
		head.next.next = new Node1(arr.get(2));
		head.next.next.next = new Node1(arr.get(3));


		insertHead(val, head);
		printLL(head);
	}

}

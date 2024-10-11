package linkedList;

class Node4
{
	int data;
	Node4 next;

	public Node4(int data, Node4 next) {
		this.data = data;
		this.next = next;
	}

	public Node4(int data) {
		this.data = data;
		this.next = null;
	}
}


public class program5 {
	public static void searchElement(Node4 head,int val)
	{
		Node4 temp =head;
		while(temp!=null)
		{
			if(temp.data == val)
			{
				System.out.println("Element is found :"+temp.data);
				break;
			}
			else
			{
				temp = temp.next;
			}
			
		}
	}
	public static void main(String[] args) {
		/*
		 * Search if the element is found in the linked list.
		 * output = Element is found :linkedList.Node4@372f7a8d  address
		 * Element is found :3 value
		 * 
		 */

		int[] ar = {1,2,3,4,5};
		Node4 head = new Node4(ar[0]);
		head.next =new Node4(ar[1]);
		head.next.next =new Node4(ar[2]);
		head.next.next.next =new Node4(ar[3]);
		head.next.next.next.next =new Node4(ar[4]);

		int val = 3;
		searchElement(head,val);
	}

}

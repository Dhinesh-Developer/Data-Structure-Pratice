package linkedList;

class Node
{
	int data;
	Node next;
	
	public Node(int data1,Node next1) 
	{
		data = data1;
		next = next1;
	}
	public Node(int data1) 
	{
		data =data1;
	}
}

public class progam1 {
	public static void main(String[] args) {
		/*
		 * creating a linked list. Structure and class.
		 * 
		 */
		
		int[] arr = {1,2,3,4,5};
		Node y = new Node(arr[2]);
		System.out.println(y.data);
	}

}

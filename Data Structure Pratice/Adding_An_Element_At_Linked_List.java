class Node1
{
	
	int data;
	Node1 Next;
	Node1(int data)
	{
		this.data = data;
		this.Next = null;
		
	}
}
class LinkedList2
{
	Node1 head;
	void printLinkedList()
	{
		Node1 curr = (Node1) this.head;
		while(curr != null) 
		{
			System.out.println(curr.data);
			curr = curr.Next;
		}
	}
	
	void Add(int e)
	{
		Node1 temp = new Node1(e);
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node1 curr = head;
			while(curr.Next != null)
			{
				curr = curr.Next;
			}
			curr = curr.Next;
		}
		
	}
	
	void AddFirst(int e)
	{
		Node1 temp = new Node1(e);
		if(head == null)
		{
			head = temp;
		}
		else {
			temp.Next = head;
			head = temp;
		}
	}
}




public class Adding_An_Element_At_Linked_List {

	public static void main(String[] args) {
		
		LinkedList2 ll = new LinkedList2();
		ll.Add(10);
		ll.Add(20);
		ll.Add(30);
		ll.Add(40);
		
		
		ll.AddFirst(5);
		ll.AddFirst(2);
		
		ll.printLinkedList();
		
		
	}

}

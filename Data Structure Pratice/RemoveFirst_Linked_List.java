class Lnode{
	int data;
	Lnode next;
	Lnode(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class SinglyLinkedList
{
	Lnode head;
	void printLinkedList()
	{
		Lnode curr = this.head;
		while(curr != null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	void add(int e)
	{
		Lnode temp = new Lnode(e);
		if(head == null)
		{
			head = temp;
		}
		else {
			Lnode curr = head;
			while(curr.next != null)
			{
				curr = curr.next;
			}
			curr.next = temp;
		}
	}
	
	void addFirst(int e)
	{
		Lnode temp = new Lnode(e);
		if(head == null)
		{
			head = temp;
		}
		else {
			temp.next = head;
			head = temp;	
		}
	}
	
	void add(int index , int element) throws ArrayIndexOutOfBoundsException
	{
		try
		{
			if(index == 0)
			{
				addFirst(element);
			}
			else {
				Lnode temp = new Lnode(element);
				int count = 0;
				Lnode curr  = this.head;
				while(count < index-1)
				{
					curr = curr.next;
					count++;
				}
				temp.next = curr.next;
				curr.next = temp;
			}
		}
		catch(NullPointerException e)
		{
			throw new IndexOutOfBoundsException();
		}
	}
	
	void addAll(int[] elements)
	{
		for(int element : elements)
		{
			addFirst(element);
		}
	}
	
	
	void removeFirst()
	{
		if(head == null)
		{
			
		}
		else if(head.next == null)
		{
			head = null;
		}
		else if(head.next != null)
		{
			Lnode curr = head;
			head = head.next;
			curr.next = null;
			
		}
	}
	
	
}


public class RemoveFirst_Linked_List {
  
	public static void mani(String[] args)
	{
		
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		ll.add(2,25);
		int[] ar = {1,2,3,4,5};
		ll.addAll(ar);
		
		ll.printLinkedList();
		
		
	}
}

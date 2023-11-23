package PA8;
class Link2
{
	public Object data;
	public Link2 next;
	public Link2 previous;
	
	public Link2(Object o)
    {
    	data = o;
    } 
	
	public String toString() {
		return data.toString();
	}
}

class DoublyLinkedList
{
	private Link2 first; // reference to first link on list
	private Link2 last; // reference to first link on list
	
	public DoublyLinkedList()
	{
		first = null;
		last = null;
	}
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	public void insertFirst(Object d)
	{
		Link2 newLink = new Link2(d);
		if( isEmpty() ) { 
			last = newLink;
		} else {
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink; 
	}
	
	public void insertLast(Object d)
	{
		Link2 newLink = new Link2(d);
		if( isEmpty() ) 
			first = newLink; 
		else
		{
			last.next = newLink;
			newLink.previous = last; 
		}
		last = newLink;
	}
	
	public Object removeFirst() 
	{ 
		Object temp = first.data;
		if(first.next == null)
			last = null; 
		else
			first.next.previous = null; 
		first = first.next;
		return temp;
	}
	
	public Object removeLast()
	{ 
		Object temp = last.data;
		if(first.next == null)
			first = null;
		else
			last.previous.next = null; 
		last = last.previous; 
		return temp;
	}
	public Object getFirst()
	{
		return first.data;
	}
	public Object getLast()
	{
		return last.data;
	}
	public void displayForward()
	{
		System.out.print("[ ");
		Link2 current = first;
		while(current != null) 
		{
		System.out.print(current + " ");
		current = current.next; 
		}
		System.out.println("]");
	}	
	
	public void displayBackward()
	{
		System.out.print("[ ");
		Link2 current = last;
		while(current != null)
		{
			System.out.print(current + " "); 
			current = current.previous; 
		}
		System.out.println("]");
	}
	
	
	
	
}
package PA8;
class Link {
	public Object data;
	public Link next;

	public Link(Object o) {
		this.data = o;
		this.next = null;
	}

	public String toString() {
		return data.toString();
	}
}

class LinkList {
	private Link head;

	public LinkList() {
		head = null;
	}

	public void insertFirst(Object o) {
		Link newLink = new Link(o);
		newLink.next = head;
		head = newLink;
	}

	public Object removeFirst() {
		Object res = head.data;
		head = head.next;
		return res;
	}

	public Object getFirst() {
		return head.data;
	}

	public void insertLast(Object o) {
		Link newLink = new Link(o);
		if (head == null) {
			head = newLink;
			return;
		}
		Link current = head;
		while (current.next != null)
			current = current.next;
		current.next = newLink;
	}

	public Object removeLast() {
		if (head.next == null) {
			Object res = head.data;
			head = null;
			return res;
		}
		Link current = head;
		while (current.next.next != null)
			current = current.next;
		Object res = current.next.data;
		current.next = null;
		return res;
	}

	public Object getLast() {
		Link current = head;
		while (current.next != null)
			current = current.next;
		return current.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public String toString() {
		if (head == null)
			return "[ ]";
		String res = "[ " + head.data;
		Link current = head.next;
		while (current != null) {
			res += ", " + current.data;
			current = current.next;
		}
		res += " ]";
		return res;
	}

//	The internal implementation of addones
	private void add_a_one(){
		Link curr = head;
		while(curr!=null){
			curr.data= (int)curr.data + 1;
			curr = curr.next;
		}
	}
	private void add_a_one_2(){
		help(head);
	}
	private void help(Link curr){
		if(curr==null){
			return;
		}
		else{
			curr.data =(int)curr.data + 1;
			help(curr.next);
		}
	}

	public void cutList() {
		if (head==null)
			return;
		Link current=head;
		Link previous= null;
		int count=0;
		while (current!=null){
			count++;
			current = current.next;
		}
		current=head;
		for (int i=1; i<count/2 + count%2; i++)
		{
			current=current.next;
		}
		previous = current;
		while (current.next!=null)
		{
			current = current.next;
		}
		current.next = head;
		head = previous.next;
		previous.next = null;
	}
	public static void main(String[]args){
		LinkList l = new LinkList();
		l.insertLast(0);
		l.insertLast(1);
		l.insertLast(2);
		l.insertLast(3);
		l.insertLast(4);
		l.insertLast(5);
		l.insertLast(6);
		l.insertLast(7);
		l.insertLast(8);

		System.out.println(l.toString());

		l.add_a_one_2();

		System.out.println(l.toString());
	}
}

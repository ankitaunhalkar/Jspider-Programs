package LinkList;

public class ReverseIterate {
	static Node head;
	int size;
	class Node{
		int data;
		Node next;
		Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
	}
	void add(int item)
	{
		Node newnode=new Node(item,null);
		if (head == null) {
			head = newnode;
			System.out.println("Insert1:"+head.data);
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			
			temp.next = newnode;
			System.out.println("Insert2:"+temp.next.data);
		}
	}
	void display(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+"->");
			node=node.next;
		}
	}
	Node reverse(Node node)
	{
		Node current=node;
		Node previous=null;
		Node nextp;
		while(current!=null)
		{
			nextp=current.next;
			current.next=previous;
			previous=current;
			current=nextp;
		}
		node=previous;
		return node;
	}
	public static void main(String[] args) {
		ReverseIterate r=new ReverseIterate();
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(4);
		r.display(head);
		Node rev=r.reverse(head);
		r.display(rev);
	}
}

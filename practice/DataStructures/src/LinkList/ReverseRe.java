package LinkList;

public class ReverseRe {
	static Node head;
class Node
{
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
	if(head==null)
	{
		head=newnode;
		System.out.println("inserted:"+head.data);
	}
	else
	{	Node tmp=head;
		while(tmp.next!=null)
			tmp=tmp.next;			
		tmp.next=newnode;
		System.out.println("inserted:"+tmp.next.data);

	}
}
void display(Node node)
{
	while(node!=null)
	{
		System.out.println(node.data+"->");
		node=node.next;
}
}
	Node reverse(Node curr,Node prev)
	{
		if(curr.next==null)
		{
			head=curr;
			curr.next=prev;
			return null;
		}
		Node next1=curr.next;
		curr.next=prev;
		reverse(next1,curr);
		return head;
	}
	
	public static void main(String[] args) {
		ReverseRe r =new ReverseRe();
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(4);
		System.out.println("Normal");
		r.display(head);
		System.out.println("Reverse");
		Node rev=r.reverse(head,null);
		r.display(rev);
	}
}


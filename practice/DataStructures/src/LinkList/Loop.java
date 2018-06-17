package LinkList;

public class Loop {
static Node head;
static class Node
{
	Node next;
	int data;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
void print(Node node)
{
	while(node!=null)
	{
		System.out.println(node.data);
		node=node.next;
	}
}
void detect(Node node)
{
Node s=node;Node f=node;
while(s!=null && f!=null && f.next!=null)
{
	s=s.next;
	f=f.next.next;
	if(s==f)
	{
		remove(node,s);
	}
}
}
void remove(Node curr,Node slow)
{
	Node pt1=null,pt2=null;
	pt1=curr;
	while(true)
	{
	pt2=slow;
	while(pt2.next!=slow && pt2.next!=pt1)
	{
		pt2=pt2.next;
	}
	if(pt2.next==pt1)
	{
		break;
	}
	pt1=pt1.next;
	}
	pt2.next=null;
}
public static void main(String[] args) {
	Loop l=new Loop();
	l.head=new Node(1);
	l.head.next=new Node(2);
	l.head.next.next=new Node(3);
	l.head.next.next.next=new Node(4);
	l.head.next.next.next.next=new Node(5);
	
	//loop
	l.head.next.next.next.next.next=head.next;
	
	l.detect(head);
	l.print(head);
}
}

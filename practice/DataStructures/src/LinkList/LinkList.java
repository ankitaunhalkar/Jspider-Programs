package LinkList;
public class LinkList {
class Node{
	Node next;
	Node prev;
	int data;
	Node(Node prev,int data,Node next)
	{
		this.next=next;
		this.prev=prev;
		this.data=data;
	}
}
	Node head;
	Node tail;
	int size;
	
	void addFirst(int item)
	{
		Node newnode=new Node(null, item, head);
		if(head!=null)
		{
			head.prev=newnode;
		}
		head=newnode;
		if(tail==null)
		{
			tail=newnode;
		}
		size++;
		System.out.println("Adding first:"+item);
	}
	
	void addLast(int item)
	{
		Node newnode=new Node(tail, item, null);
		if(tail!=null)
		{
			tail.next=newnode;
		}
		tail=newnode;
		if(head==null)
		{
			head=newnode;
		}
		size++;
		System.out.println("Adding last:"+item);
	}
	int deletefirst()
	{
		if(size==0){System.out.println("Empty");}
		Node dnode=head;
		head=head.next;
		head.prev=null;
		size--;
		System.out.println("Deleted first:"+dnode.data);
		return dnode.data;
	}
	int deletelast()
	{
		if(size==0){System.out.println("Empty");}
		Node dnode=tail;
		tail=tail.prev;
		tail.next=null;
		size--;
		System.out.println("Deleted last:"+dnode.data);
		return dnode.data;
	}
	void forward()
	{
		Node tmp=head;
		while(tmp!=null)
		{
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
	void backward()
	{	
		Node tmp=tail;
		while(tmp!=null)
		{
			System.out.println(tmp.data);
			tmp=tmp.prev;
		}
	}
public static void main(String[] args) {
	LinkList l=new LinkList();
	l.addFirst(1);
	l.addLast(2);
	l.addLast(3);
	l.addFirst(0);
	l.forward();
	l.deletefirst();
	l.deletelast();
	l.backward();
}
}

package LinkList;

import java.util.Stack;

public class ReverseStack {
Stack<Node> s=new Stack<Node>();
Node head;
Node tail;
int size;
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
void add(int item)
{
	Node newnode=new Node(item);
	if(head==null)
	{
		head=newnode;
	}
	else{
	Node tmp=head;
	while(tmp.next!=null)
	tmp=tmp.next;
	tmp.next=newnode;}
	
}

void reverse()
{
	if(head==null) return;
	Node tmp1=head;
	while(tmp1!=null)
	{
		s.push(tmp1);
		tmp1=tmp1.next;
	}
   Node	temp=s.peek();
   head=temp;
   s.pop();
   while(!s.isEmpty())
   {
	   temp.next=s.peek();
	   s.pop();
	   temp=temp.next;
   }
   temp.next=null;
}
void display()
{
	Node temp = head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
}
public static void main(String[] args) {
	ReverseStack rs=new ReverseStack();
	rs.add(1);
	rs.add(2);
	rs.add(3);
	rs.add(4);
	rs.display();
	rs.reverse();
	rs.display();
}
}

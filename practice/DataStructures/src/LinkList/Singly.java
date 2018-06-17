package LinkList;

public class Singly {
class Node{
	int data;
	Node next;
	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}}
	Node head;
	Node tail;
	int size;
	void addpos(int item,int pos)
	{
		   Node nptr = new Node(item,null);                
	        Node ptr = head;
	        pos = pos - 1 ;
	        for (int i = 1; i < size - 1; i++) 
	        {
	            if (i == pos) 
	            {
	                Node tmp = ptr.next ;
	                ptr.next= nptr ;
	                nptr.next=tmp;
	                break;
	            }
	            ptr = ptr.next;
	        }
	        size++ ;
	}
	void addFirst(int item)
	{
		Node newnode=new Node(item, null);
			if(head==null)
			{
				head=newnode;
				tail=head;
				System.out.println("Inserted"+item);
			}
			else
			{
				newnode.next=head;
				head=newnode;
				System.out.println("Inserted"+item);
			}
		size++;
				
	}
	void addlast(int item)
	{
		Node newnode=new Node(item, null);
		if(head==null)
		{
			head=newnode;
			tail=head;
			System.out.println("Insterted"+item);
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
			System.out.println("Insterted"+item);
		}
	size++;
		
	}
	void forward()
	{
		
		while(head!=null){
			
		System.out.print(head.data+"->");
		head=head.next;
		
		}
	}
	void deleteFirst()
	{
		System.out.println("Deleted"+head.data);
		head=head.next;
		size--;
		
	}
	
	

	public static void main(String[] args) {
		Singly s=new Singly();
		
		s.addFirst(1);
		s.addFirst(0);
		s.addlast(2);
		s.addlast(3);
		s.addpos(4, 5);
		s.addlast(5);
		
		//s.deleteFirst();
		s.forward();
	}
}


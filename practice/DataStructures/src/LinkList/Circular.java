package LinkList;

public class Circular {
	public class Node {

		 Node previous;
	     Node next;
		private int data ;
		
		Node(Node previous,int data,Node next){
			
			this.previous=previous;
			this.data= data;
			this.next=next;
		}
		
		int data(){
			
			return data;
		}
	}

		
		Node head;
		Node tail;
		static int size=0 ;
		
		
		void addFront(int data){
			
			if (head==null){
				
				Node newNode = new Node(head, data, tail);
				head=newNode;
				tail=newNode;
			    
			}else{
				
				Node newNode= new Node(tail,data,head);
				head.previous=newNode;
				tail.next=newNode;
				head=newNode;
			}
			size++;
		}
		
		void addBack(int data){
			
			if (head==null){
				
				Node newNode = new Node(head, data, tail);
				head=newNode;
				tail=newNode;
			    }
			else{
			    	
			    	Node newNode = new Node(tail,data,head);
			    	tail.next=newNode;
			    	head.previous=newNode;
			    	tail=newNode;
			 
			    }
			size++;
		}
		
		void removeFront(){
			
			if (head==null)return;
			
			if(head==tail){
				
				head=null;
				tail=null;
				}
			else{
				
				tail.next=head.next;
				head.next.previous=tail;
				head=head.next;
				
			}
			size--;
		}
		
		void removeBack(){
			
			if(head==null)return;
			if(head==tail){
				head=null;
				tail=null;
			}else{
				
				
				tail.previous.next=head;
				head.previous=tail.previous;
				tail=tail.previous;
			}
			size--;
			
		}
		
		void insertAt(int index,int data){
			
			 if (index<0||index>size)return;
			 if(index==0){
				 addFront(data);
			 }else if(index==size-1){
				 
				 addBack(data);
			 }else{
				 
				 Node current= head;
				 for(int i=0;i<index-1;i++){
					 
					 
					 current=current.next;
			
				 }
				 Node newNode= new Node(current, data, current.next);
				 current.next.previous=newNode;
				 current.next=newNode;
			 }
			size++;
			
		}
		
		void removeAt(int index){
			
			 if (index<0||index>size)return;
			 if(index==0){
				removeFront();;
			 }else if(index==size-1){
				 
				 removeBack();
			 }else{
				 
				 
				 Node current=head;
				 for(int i=0;i<index;i++){
					 
					 current= current.next;
				 }
				 current.previous.next=current.next;
				 current.next.previous=current.previous;
				 current=null;
				 
			 }
			size--;
		}
		
		
		void display(){
			if(head==null){
				return;
			}
			Node current = head;
			while(current.next!=head){
				
				System.out.println(current.data());
				current= current.next;
			}
			System.out.println(current.data());
			current=current.next;
			System.out.println(current.data());
		}
		
		
		public static void main(String[] args) {
			
			Circular list = new Circular();
			list.addFront(2);
			list.addFront(1);
			list.addBack(4);
			list.addBack(5);
			list.addBack(6);
			list.display();
			System.out.println("Size is "+size);
			System.out.println("-----");
//			list.removeFront();
		//	list.removeBack();
			list.insertAt(2, 3);
			//list.removeAt(2);
			list.display();
			
			
		}
		
	
}

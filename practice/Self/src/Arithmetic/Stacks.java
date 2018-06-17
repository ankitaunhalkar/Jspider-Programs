package Arithmetic;

public class Stacks {
	char a[];
	int size;
	int top;
	Stacks()
	{
		size=20;
		top=-1;
		a=new char[size];
	}
	void push(char item)
	{
		if(!isempty())
		{
			System.out.println("Stack Full");
		}
		else
		{
			a[++top]=item;
			System.out.println("insterted:"+a[top]);
		}
	}
	 boolean isempty() {
		if(top==-1)
		return true;
		else
		return false;
	}
	 void pop()
	 {
		 if(isempty())
		 {
			 System.out.println("stack underflow");
		 }
		 else
		 {
			 int p=a[top--];
			 System.out.println("Deleted:"+(char)p);
		 }
			 
	 }
	 char peak()
	 {
		 return (char) (a[top]);
	 }
	 
}

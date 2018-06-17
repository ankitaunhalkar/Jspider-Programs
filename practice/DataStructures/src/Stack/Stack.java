package Stack;

public class Stack {
	
private int array[];
private int size;
private int top;

public Stack() {
	size=10;
	top=-1;	
	array = new int[size];
}

public void push(int item)
{
	if(top>=size-1)
	{
		System.out.println("Stack Full");
	}
	top=++top;
		array[top]=item;
		System.out.println(top);
		//System.out.println(array[top]);
}


public Integer pop() {
	if(top<0)
		return null;
	return array[top--];
}
}

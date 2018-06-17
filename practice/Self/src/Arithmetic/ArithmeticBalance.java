package Arithmetic;
import java.util.Stack;

public class ArithmeticBalance {

	public static void main(String[] args) {
	Stack s=new Stack();
	String str="(5+6)*(4+3)/(5+6)";
	int len=str.length();
	for(int i=0;i<len;i++)
	{
		if(str.charAt(i)=='(')
		{
		System.out.println(s.push(str.charAt(i)));
		}
		else if(str.charAt(i)==')')
		{
			System.out.println(s.pop());
		}
		
	}
	if(s.isEmpty())
	{
		System.out.println("Balanced");
	}
	else
	{
		System.out.println("Not Balanced");
	}
	
}

}

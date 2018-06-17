package Arithmetic;

public class ArithmeticLogic {

	public static void main(String[] args) {
		String s="(5+6)*(4+3)/(5+6)(";
		int len=s.length();
		Stacks st=new Stacks();
		
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='(')
			{
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)==')')
			{
				st.pop();
			}	
		}
		if(st.isempty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}
}

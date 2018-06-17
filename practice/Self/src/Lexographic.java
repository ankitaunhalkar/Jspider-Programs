import java.util.Scanner;

public class Lexographic {

	public static void main(String[] args) {
		String str[]={"cat","dog","cow","donkey","zebra","monkey"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String input=sc.next();
		String out="";
		int len=input.length();
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++)
		{			
			out=str[len];
		}
		System.out.println(out);
	}

}


public class reverseWord {
public static void main(String[] args) {
	String str="Hello To Java World";
	int len=str.length();
	String reverse = "",temp="";
	for(int i=0;i<len;i++)
	{
		if(str.charAt(i)!=' ')
		{
			temp=str.charAt(i)+temp;
			//System.out.println("temp="+temp);
		}
		else if(str.charAt(i)==' ')
		{
			reverse+=temp+" ";
			//System.out.println("reverse="+reverse);
			temp="";
		}
		
	}
	reverse+=temp;
	System.out.println(reverse);
}
}

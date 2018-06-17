
public class CountWords {
public static void main(String[] args) {
	String str="Hello to world of engineer";
	char s[]=str.toCharArray();int count=1;
	for(int i=0;i<s.length;i++)
	{
		if(s[i]==' ' && s[i+1]!=' ')
		{
			count++;
		}
	}
	System.out.println(count);
}
}

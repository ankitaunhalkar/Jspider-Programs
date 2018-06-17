
public class Tidy {

	public static void main(String[] args) {
		String s="12123";
		char a[]=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)>s.charAt(i+1))
			{
				System.out.println(a[i]);
				a[i]--;
				System.out.println(a[i]);
				for(int j=i+1;j<s.length();j++)
				{
					System.out.println("j"+j);
					System.out.println(a[j]);
					a[j]='9';
					System.out.println("value is:"+a[j]);
				}
				break;
			}
		}
		String st1=new String(a);
		System.out.println(st1);
			
	}
}

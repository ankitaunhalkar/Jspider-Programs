
public class meta {
public static void main(String[] args) {
	String s1="Converse";
	String s2="Conserve";
	char sa1[]=s1.toCharArray();
	char sa2[]=s2.toCharArray();
	char c1;int count=0;
	if(sa1.length==sa2.length)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(sa1[i]!=sa2[i])
			{
				c1=sa1[i];
				sa2[i]=c1;
				count++;
			}
		}
	}else{System.out.println("Length Not Matching");}
	if(count==2)
	{
		s2="";
		for(int i=0;i<s1.length();i++){
			if(sa1[i]==sa2[i])
			{	
				s2=s2+sa2[i];		
			}
		}
		if(s1.equals(s2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	else{
		System.out.println("More the 2 have to be changed");
	}
	}
}

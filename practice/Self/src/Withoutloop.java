
public class Withoutloop {
	static int value(int i)
	{
		int a = 0;
		if(i>1)
		{	
			//System.out.println(i);
		a=value(i-1);
		System.out.println(a);
		}
		if(a==5)
		{
			a--;
			rev(a);
		}
		return i;
	}
	static int rev(int j)
	{
		if(j>0){
			System.out.println(j);
			rev(j-1);
		}
		
		return j;
	}
public static void main(String[] args) {
	int i=6;
	value(i);
}
}

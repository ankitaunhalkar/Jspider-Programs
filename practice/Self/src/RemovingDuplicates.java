import java.util.Arrays;

public class RemovingDuplicates {
public static void main(String[] args) {
	int a[]={1,2,3,1,2,4,1,3,5,6,7,2};
	Arrays.sort(a);
	for(int i=1;i<a.length;i++)
	{
		if(a[i-1]==a[i])
		{
			int b=(int) a[i];
			//System.out.println(b);
		}
		else
		{
			System.out.println(a[i]);
		}
		
	}
}
}

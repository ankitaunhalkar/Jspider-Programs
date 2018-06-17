import java.util.Arrays;

public class MultiplicationArray {
public static void main(String[] args) {
	
	int arr[]={1,2,5,6};
	int len=arr.length;

	for(int i=0;i<len;i++)
	{
		int sum=1;
		for(int j=0;j<len;j++)
		{
			if(i==j)
			{
				continue;
			}
			sum=sum*arr[j];
		}
		System.out.print(sum+" ");
	}
}
}

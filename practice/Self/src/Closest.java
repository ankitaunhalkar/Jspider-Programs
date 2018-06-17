import java.util.ArrayList;
import java.util.List;

public class Closest {
public static void main(String[] args) {
	int arr[]={1,3,4,7,10};
	int x=15;int u=0;int v=0;
	int len=arr.length;int sum=0;
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			sum=arr[i]+arr[j];
			if(sum<x)
			{				
				u=arr[i];
				v=arr[j];			
			}
		}
	}
	System.out.println(u+" "+v);	
}
}

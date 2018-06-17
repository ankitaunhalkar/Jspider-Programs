import java.util.ArrayList;
import java.util.List;

public class FrequencySort {
	void swap(int max,int value)
	{
		int va[] = null;
		
		for(int k=1;k<=max;k++)
		{			
			
		}
	}
public static void main(String[] args) {
	int[] a={2,2,5,1,7,1,5,1,5,2,7,8,3};
	List l=new ArrayList();
	int count=0;int temp;int b[] = new int[20];
	int val;
	for(int i=0;i<a.length;i++)
	{
		count=0;
		for (int j = 0; j <a.length; j++) {
			if(a[i]==a[j])
			{
				count++;
				b[a[i]]=count;
			}
		}	
	}int c[]=null;
	for (int i = 0; i < b.length; i++) {
		int max=0;int value=0;
		if(max<b[i])
		{
			max=b[i];
			value=i;	
			for(int k=1;k<=max;k++)
			{			
				if(max>1)
				{
					/*System.out.println("max"+max);
					System.out.println("value"+value);*/			
				}	
				 
			}
		}
	}	
		
	
	
	/*for (int i : b) {
		System.out.println(i);
	}*/
}
}

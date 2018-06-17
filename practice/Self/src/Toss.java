
import java.util.Random;
import java.util.Scanner;

public class Toss {
public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	int tail = 0;
	System.out.println("Enter the number of times to flip coin:");
	int n=ss.nextInt();
	for(int i=0;i<n;i++)
	{
		if(Math.random()<0.5)
		{
			tail++;
			System.out.println("tail");
		}	
	}
	System.out.println("tail"+((float)tail/n)*100);
	System.out.println("head"+(((float)n-tail)/n)*100);	
}
}

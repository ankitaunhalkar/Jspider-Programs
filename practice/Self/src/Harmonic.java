import java.util.Scanner;

public class Harmonic {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=s.nextInt();
	int i;
	double a=0.0;
	for(i=1;i<=n;i++)
	{
		 a=a+(double)1/i;
		
	}
	/*while(i<=n)
	{
		a=a+(double)1/i;
		i++;
	}*/
	 System.out.println(a);
}
}

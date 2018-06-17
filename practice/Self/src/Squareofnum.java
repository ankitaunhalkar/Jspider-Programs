import java.util.Scanner;

public class Squareofnum {
public static void main(String[] args) {
	int square = 0; int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your number:");
	int num=s.nextInt();
	square=num*num;
	System.out.println("Square:"+square);
	for(int i=1;i<=num;i++)
	{
		sum=i*i;	
	}	
	System.out.println("Sum Series:"+sum);
}
}

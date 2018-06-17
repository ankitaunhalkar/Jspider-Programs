import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=s.nextInt();
	if((n & 1)==0)
	{
		System.out.println("Even number");
	}
	else
		System.out.println("Odd number");
}
}

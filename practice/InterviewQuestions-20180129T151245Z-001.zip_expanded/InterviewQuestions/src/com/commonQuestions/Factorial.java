package com.commonQuestions;

import java.util.Scanner;

public class Factorial{
	
	public static void main(String[] args) {
		
		int i = 1, f, num;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the number");
		num = s1.nextInt();
		f = fact(num);
		System.out.println("The factorial is " + f);

	}

	static int fact(int n) {
		if (n == 1)
			return 1;
		else
			return (n * fact(n - 1));

	}

}


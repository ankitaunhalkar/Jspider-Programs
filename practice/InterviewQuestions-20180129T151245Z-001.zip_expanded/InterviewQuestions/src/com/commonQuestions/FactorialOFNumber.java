package com.commonQuestions;


public class FactorialOFNumber {
	public static void main(String[] args) {
		int number = 5;
		/*
		* Factorial of any number is! n.
		* For example, factorial of 4 is 4*3*2*1.
		*/
		int factorial = number;
		for(int i =(number - 1); i > 1; i--)
		{
			factorial = factorial * i;
			}
			System.out.println("Factorial of a number is " + factorial);
			}
			}
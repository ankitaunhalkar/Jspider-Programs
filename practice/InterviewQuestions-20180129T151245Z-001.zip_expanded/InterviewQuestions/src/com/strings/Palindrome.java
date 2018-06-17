package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to check if it is palindrome");
		original=sc.nextLine();
		int length=original.length();
		for( int i=length-1;i>=0;i--)
			
		{
			reverse=reverse+original.charAt(i);
			
		}
		if(original.equals(reverse))
		{
			System.out.println("entered string is a palindrome");
			
		}
		else 
		{
			System.out.println("entered stirng is not a palindrome");
			
		}
	sc.close();
	}


		
	}
package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheString {
	public static void main(String[] args) {
		String original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");
		original=sc.nextLine();
		int length=original.length();
		for( int i=length-1;i>=0;i--)
			
		{
			reverse=reverse+original.charAt(i);
			
		}
	
			System.out.println("reverse strinng is:"+reverse);
			sc.close();
	}	
		}
	

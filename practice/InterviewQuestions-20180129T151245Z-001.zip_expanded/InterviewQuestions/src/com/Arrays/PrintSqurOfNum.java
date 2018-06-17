package com.Arrays;

import java.util.Scanner;

public class PrintSqurOfNum {
	public static void main(String[] args) {
		
		//Sum of 1 + 2 + ….  + n series 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		int sum=0;
	    for(int i=1;i<=num;i++)
	        sum =( i * i);

	    System.out.println("sum  :: "+sum);

	}
	}

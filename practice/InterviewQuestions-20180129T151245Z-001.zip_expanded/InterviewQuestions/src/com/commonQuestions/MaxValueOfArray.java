package com.commonQuestions;

import java.util.Scanner;

public class MaxValueOfArray {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	double[] a;
	
	System.out.println("enter the size of an array  :");
	
	int size=sc.nextInt();
	
	a=new double[size];
	
	System.out.println("enter the values");
	
	for (int i = 0; i <=a.length-1; i++) {
		a[i]=sc.nextDouble();
	}
	
	System.out.println("array elements are :");
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	System.out.println("Maximum value ::");
	
	double max=a[0];
	for (int i = 1; i < a.length; i++) 
	{
		if (a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
}
}
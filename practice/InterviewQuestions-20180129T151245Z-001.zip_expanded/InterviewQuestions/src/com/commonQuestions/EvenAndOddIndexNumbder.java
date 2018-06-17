package com.commonQuestions;

public class EvenAndOddIndexNumbder {
public static void main(String[] args) {
	
	int[] a=new int[]{23,34,56,77,12};
	
	System.out.println("Array elements :: ");
	for (int i = 0; i < a.length; i++) 
	{
		System.out.print(a[i]+",");
	}
	System.out.println();

	for (int i = 0; i <=a.length; i+=2) 
	{
		System.out.println("even index numbers ::"+a[i]+" ");
		
	}
	System.out.println("-------------");
	for (int i = 1; i <a.length; i+=2) 
	{
		System.out.println("odd index number ::"+a[i]+" ");
	}
}
}

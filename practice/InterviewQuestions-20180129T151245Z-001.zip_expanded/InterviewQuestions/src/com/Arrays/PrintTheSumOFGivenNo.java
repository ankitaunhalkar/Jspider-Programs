package com.Arrays;

import java.util.Scanner;

public class PrintTheSumOFGivenNo {
public static void main(String[] args) {
	
	//Sum of 1 + 2 + ….  + n series 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number : ");
	
	int num=sc.nextInt();
	int sum = (num * (num + 1)) / 2;

	System.out.print("Sum of the series: ");

    for(int i =1;i <= num;i++){
         if (i!=num)
             System.out.print(i);
         else
        	 System.out.print(i+" "+sum);
         }
}
}

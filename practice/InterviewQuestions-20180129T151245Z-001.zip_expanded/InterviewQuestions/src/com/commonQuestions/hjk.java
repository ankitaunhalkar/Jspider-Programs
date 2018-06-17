package com.commonQuestions;

import java.util.Scanner;

public class hjk {
public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp;
		int rs=0;
		while(num>0){
			temp=num%10;
		 if(rs<=temp)
			 rs=temp;
		num=num/10;
		}
		System.out.println("tthe largest digit in the given number :"+rs);
		
	}




}

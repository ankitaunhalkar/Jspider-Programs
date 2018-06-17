package com.commonQuestions;

import java.util.Scanner;


public class Armstrong{
	public static void main(String args[]){
		//int num = Integer.parseInt(args[0]);
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("enter the number  " +num);
		int n = num; //use to check at last time
		int check=0,remainder;
		while(num > 0){
		remainder = num % 10;
		check = check +(remainder*remainder*remainder); //(int)Math.pow(remainder,3);
		num = num / 10;
		}
		if(check == n)
		System.out.println(n+" is an Armstrong Number");
		else
		System.out.println(n+" is not a Armstrong Number");
		}
		}
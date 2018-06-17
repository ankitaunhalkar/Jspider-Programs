package com.commonQuestions;


public class PrimeNoOrNot{
	public static void main(String args[]){
		int num = 17;
		int flag=0;
		for(int i=2;i<num;i++){
		if(num%i==0)
		{
		System.out.println(num+" is not a Prime Number");
		flag = 1;
		break;
		}
		}
		if(flag==0)
		System.out.println(num+" is a Prime Number");
		}
		}
		
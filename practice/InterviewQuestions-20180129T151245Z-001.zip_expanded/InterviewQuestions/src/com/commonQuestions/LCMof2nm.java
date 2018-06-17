package com.commonQuestions;

import java.util.Scanner;

public class LCMof2nm {
static int num1,num2,x;
	
	public static void main(String[] args) {
		
		int res;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the first number");
		num1=s1.nextInt();
		System.out.println("enter the second number");
		num2=s1.nextInt();
		
		if(num1>=num2){
			x=num1;
		}else{
			x=num2;
		}
		
		res=lcd(x);
		System.out.println("LCD of the given number is "+res);
		
	}
	
	static int lcd(int x){
		while(true){
			
		      if((x%num1==0)&&(x%num2==0)){
			return x;
			
		       }
                   x++;
		}
	}

}





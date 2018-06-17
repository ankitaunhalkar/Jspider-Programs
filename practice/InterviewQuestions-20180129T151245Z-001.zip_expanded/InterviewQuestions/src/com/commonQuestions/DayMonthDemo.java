package com.commonQuestions;


public class DayMonthDemo{
	
	//Input - 69
//Output - 69 days = 2 Month and 9 days */

public static void main(String args[]){
int num = 78;
int days = num%30;
int month = num/30;
System.out.println(num+" days = "+month+" Month and "+days+" days");
}
}
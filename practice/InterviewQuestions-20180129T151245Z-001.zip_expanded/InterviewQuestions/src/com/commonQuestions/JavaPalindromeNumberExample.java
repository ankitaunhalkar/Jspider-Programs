package com.commonQuestions;


public class JavaPalindromeNumberExample {
	public static void main(String[] args) {
		//array of numbers to be checked
		int numbers[] = new int[]{121,13,34,11,22,54};
		//iterate through the numbers
		for(int i=0; i < numbers.length; i++){
		int number = numbers[i];
		int reversedNumber = 0;
		int temp=0;
		//reverse the number
		while(number > 0){
		temp = number % 10;
		number = number / 10;
		reversedNumber = reversedNumber * 10 + temp;
		}
		if(numbers[i] == reversedNumber)
		System.out.println(numbers[i] + " is a palindrome");
		else
		System.out.println(numbers[i] + " not a palindrome ");
		}
		}
		}
		
		
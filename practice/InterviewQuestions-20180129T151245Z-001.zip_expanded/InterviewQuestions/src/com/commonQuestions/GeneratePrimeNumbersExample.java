package com.commonQuestions;


public class GeneratePrimeNumbersExample {
	public static void main(String[] args) {
		//define limit
		int limit = 10;
		System.out.println("Prime numbers between 1 and " + limit);
		//loop through the numbers one by one
		for(int i=1; i < 10; i++){
		boolean isPrime = true;
		//check to see if the number is prime
		for(int j=2; j < i ; j++){
		if(i % j == 0){
			System.out.println(i+" ::"+"not  prime number");
		isPrime = false;
		break;
		}
		}
		// print the number
		if(isPrime) 
		System.out.println(i + " ::is a Prime Number ");
		}
	}
}
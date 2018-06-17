package com.commonQuestions;

public class MissingNumber {
	
		public static void main(String[] args) {

			int sum = 0;
			int arr[] = { 1, 4, 5, 3, 7, 8, 6 };

			for (int i = 1; i <=8; i++) {
				sum = sum + i;
			}

			for (int i = 0; i < arr.length; i++) {
				sum = sum - arr[i];
			}

			System.out.println("the missing number is=" + sum);
		}


}

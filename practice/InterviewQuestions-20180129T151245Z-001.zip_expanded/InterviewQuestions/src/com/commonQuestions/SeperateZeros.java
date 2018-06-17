package com.commonQuestions;

public class SeperateZeros {
	
		public static void main(String[] args) {

			int arr[] = { 0, 14, 5, 0, 3, 0, 2, 0 };

			for (int i = 0; i < arr.length; i++) {

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] >= arr[j]) {
						int num = arr[i];
						arr[i] = arr[j];
						arr[j] = num;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}


}

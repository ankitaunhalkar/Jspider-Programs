package com.commonQuestions;

public class LeadersInteger {
			public static void main(String[] args) {

			int arr[] = { 14, 9, 11, 7, 8, 5, 3 };

			System.out.println("the leaders integer are");
			for (int i = 0; i < arr.length; i++) {
				int flag = 0;

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] < arr[j]) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.print(arr[i] + " ");
				}
			}

		}


}

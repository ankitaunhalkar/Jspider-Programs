package com.commonQuestions;

import java.util.Scanner;

public class SecondlargestElement {

	public static void main(String[] args) {

		int size = 0, k;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the array size");
		size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		k = arr.length - 1;
		int temp;
		for (int i = 0; i <= k; i++) {

			for (int j = i + 1; j <= k; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
		System.out.println("which largest element do u want");
		int lar = s.nextInt();
		if (lar < size) {

			System.out.println(arr[size - lar]);
		} else {
			System.out.println("invalid enter..try again later");
		}

	}

}

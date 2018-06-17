package com.commonQuestions;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the row size");
		int row = s.nextInt();
		System.out.println("enter the col size");
		int col = s.nextInt();

		int arr[][] = new int[row][col];
		int arr1[][] = new int[row][col];

		System.out.println("enter the elements for first matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				arr[i][j] = s.nextInt();
			}
		}

		System.out.println("enter the elements for second matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				arr1[i][j] = s.nextInt();
			}
		}

		System.out.println("first matrix is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("second matrix is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(arr1[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("addition of two matrix is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				arr1[i][j] = arr[i][j] + arr1[i][j];
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(arr1[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}

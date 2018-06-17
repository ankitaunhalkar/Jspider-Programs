package com.commonQuestions;

import java.util.Scanner;

public class MatrixInverse {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int row, col;

		System.out.println("enter the row size");
		row = s.nextInt();

		System.out.println("enter the col size");
		col = s.nextInt();

		int arr[][] = new int[row][col];
System.out.println("enter the elements in matrix");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				arr[i][j] = s.nextInt();
			}

		}

		System.out.println("before inverse");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");

		}
		System.out.println("after inverse");

		int temp;
		temp = row;
		row = col;
		col = temp;

		int arr1[][] = new int[row][col];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				arr1[i][j] = arr[j][i];
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
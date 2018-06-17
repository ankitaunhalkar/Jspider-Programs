package com.commonQuestions;

import java.util.Scanner;

public class TransposeOfMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rows,column size :");
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] arr=new int[r][c];
	System.out.println("enter the elements");
	for (int i = 0; i <r; i++) {
		for (int j = 0; j <c; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("---transpose matrix---------");
	for (int i = 0; i <c; i++) {
		for (int j = 0; j <r; j++) {
			System.out.print(arr[j][i]+"\t");
		}
		System.out.println();
	}
}
}

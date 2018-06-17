package com.commonQuestions;

import java.util.Scanner;

public class SumDigitNumber {

	public static void main(String[] args) {

		int num, r, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		num = s.nextInt();

		while (num != 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		System.out.println("total number is=" + sum);
	}

}

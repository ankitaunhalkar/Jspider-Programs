package com.commonQuestions;

import java.util.Scanner;

public class LargestNumberLess {

	public static void main(String[] args) {

		int num, digit, r, temp, count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		num = s.nextInt();
		System.out.println("enter the digit");
		digit = s.nextInt();
		temp = num;
		while (temp != 0) {

			num = temp;
			count = 0;
			while (num != 0) {
				r = num % 10;
				if (digit == r) {
					count = 1;
					break;
				}

				num = num / 10;
			}
			if (count == 0) {
System.out.println("the largest element less than a Given Number="+temp);
				break;
			}
			--temp;

		}

	}

}


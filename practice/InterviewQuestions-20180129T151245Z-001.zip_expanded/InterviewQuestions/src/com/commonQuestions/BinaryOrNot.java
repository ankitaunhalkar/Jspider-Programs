package com.commonQuestions;

import java.util.Scanner;

public class BinaryOrNot {
	
	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			int num, r;
			System.out.println("enter the number");
			num = s.nextInt();
			int count = 0;
			while (num != 0) {
				r = num % 10;
				if (r > 1) {
					count = 1;
					break;
				}
				num = num / 10;
			}
			if (count == 0) {
				System.out.println("u entered binary number");
			} else {
				System.out.println("u entered non binary number");
			}
		}

	

}

package com.commonQuestions;

import java.util.Scanner;

public class BinaryToDecimal {
	
		public static void main(String[] args) {

			int num, r, j = 1, dec = 0;
			Scanner s = new Scanner(System.in);
			System.out.println("enter the binary number");
			num = s.nextInt();

			while (num != 0) {
				r = num % 10;
				dec = dec + (j * r);
				j = j * 2;
				num = num / 10;

			}

			System.out.println("the decimal value is=" + dec);
		}

	}












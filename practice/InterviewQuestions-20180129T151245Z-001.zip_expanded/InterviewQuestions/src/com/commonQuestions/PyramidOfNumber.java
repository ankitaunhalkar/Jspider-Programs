package com.commonQuestions;

public class PyramidOfNumber {

	public static void main(String[] args) {
int num=1;
		int p = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= p; k++) {
				//System.out.print("*");
				System.out.print(num);
			}
			num++;
			p = p + 2;
			System.out.println(" ");
		}

	}

}


package com.commonQuestions;

import java.util.Scanner;

public class NumberOrNot {
	
		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			String str;
			System.out.println("enter anything");
			str = s.next();
			int num = 0, char1 = 0, spes = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 49 && str.charAt(i) <= 57) {
					num++;

				} else 
				{
					if ((str.charAt(i) >= 65 && str.charAt(i) <= 90)
							|| (str.charAt(i) >= 97 && str.charAt(i) <= 122))
					{
						char1++;

					} else {
						spes++;
				}
				}

			}

			if (num == str.length()) {
				System.out.println("u entered numbers only");
			} else {
				if (char1 == str.length()) {
					System.out.println("u entered character only");
				} else {
					if (num + char1 == str.length()) {
						System.out.println("u entered numbers and character");
					} else {
						if (spes + char1 == str.length()) {
			                                  System.out.println("u entered special "
			                                  		+ "character "
			                                  		+ "and character");
						} else {
							System.out.println("u entered special character and number");
						}
					}
				}

			}

		}

	
}

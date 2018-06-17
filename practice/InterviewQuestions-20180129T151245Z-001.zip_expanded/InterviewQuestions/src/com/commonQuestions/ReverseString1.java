package com.commonQuestions;

public class  ReverseString1 {

	static StringBuffer sb = new StringBuffer("i love my india");

	public static void main(String[] args) {

		int w = 0, j;

		for (int i = 0; i < sb.length(); i++) {

			if ((sb.charAt(i) == ' ') || (i == sb.length() - 1)) {

				j = i;
				if (i != sb.length() - 1) {
					--j;
				}
				swap(w, j);
				w = i + 1;
			}

		}

		System.out.println(sb);

	}

	static void swap(int w, int j) {

		for (int i = w; i <= j; i++, j--) {
			char c = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, c);
		}

	}

}

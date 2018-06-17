package com.commonQuestions;

public class ReverseString {
	static StringBuffer s = new StringBuffer("hello good");

	public static void main(String[] args) {
System.out.println(s);
		char temp;
		int len = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++, len--) {

			temp = s.charAt(i);
			s.setCharAt(i, s.charAt(len));
			s.setCharAt(len, temp);

		}
		System.out.println(s);

	}
}

package com.commonQuestions;


public class DuplicateCharacter {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("never ever give up");

		int i, j, count;

		for (i = 0; i < s.length(); i++) {
			count = 0;     

  			for (j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;
					s.setCharAt(j, ' ');
				}
			}
			if (count > 0 && s.charAt(i) != ' ') {
				count++;
				System.out.println(s.charAt(i) + "=" + count);
			}
		}
	}
}
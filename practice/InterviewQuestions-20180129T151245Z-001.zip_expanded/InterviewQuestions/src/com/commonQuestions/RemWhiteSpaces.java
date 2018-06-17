package com.commonQuestions;

public class RemWhiteSpaces {

	public static void main(String[] args) {

		String s = " am the student of jspiders ";
		StringBuffer sb = new StringBuffer();
int count=0;

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) != ' ')) {

				sb.append(s.charAt(i));
			}else{
				count++;

			}
		}
System.out.println("count of spaces : "+count);
		System.out.println(sb);
	}

}
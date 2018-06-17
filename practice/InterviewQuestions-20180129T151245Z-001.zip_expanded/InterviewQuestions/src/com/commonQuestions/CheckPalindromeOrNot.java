package com.commonQuestions;

public class CheckPalindromeOrNot {
public static void main(String[] args) {
	
	String str="madam";
	char[] ch=str.toCharArray();
	String fnl="";		
	char temp;
	for (int i =0; i < ch.length/2; i++) {
		temp=ch[i];
		ch[i]=ch[ch.length-1-i];
		ch[ch.length-1-i]=temp;
	}
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	fnl=fnl+ch[i];
	}
	if (str.equals(fnl)) {
		System.out.println();
		System.out.println("---------");
	}else{
		System.out.println("=============");
	}
}
}

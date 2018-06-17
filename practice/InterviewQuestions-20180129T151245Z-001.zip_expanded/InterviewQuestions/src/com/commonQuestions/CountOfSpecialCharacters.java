package com.commonQuestions;

import java.util.Arrays;

public class CountOfSpecialCharacters {
	public static void main(String[] args) {
		String str="welcomr2airdit@software$";
		char [] ch=str.toCharArray();
		 int count=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]<97||ch[i]=='$') {
				System.out.println("special symbals are "+ch[i]);
			}else{
				count++;
			}
			if (ch[i]=='$') {
				System.out.println("position of the $ is "+i);
				}
		if (ch[i]=='2') {
				System.out.println("position of the 2 is :"+i);
				}}
	System.out.println("alphabets are  "+count);
	}
}

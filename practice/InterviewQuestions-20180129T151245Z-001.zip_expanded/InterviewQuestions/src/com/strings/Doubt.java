package com.strings;

import sun.applet.Main;

public class Doubt {
public static void main(String[] args) {
	String st="am citizen of india";
	char[]
 ch=st.toCharArray();
	
	for (int i= ch.length-1;i>=0; i--) {
		System.out.print(ch[i]);
	}
	String s="a is less than40 ";
	String s1="a is grater than40 ";

	int a=35;
	
	String  i=a>40?"a is grater than 40 ":"a is less than40 ";
	System.out.println();
	System.out.println(i);
	
	System.out.println(st.charAt(3));
	
	
}
}

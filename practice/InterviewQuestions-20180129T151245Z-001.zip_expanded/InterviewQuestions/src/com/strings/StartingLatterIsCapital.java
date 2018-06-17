package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StartingLatterIsCapital {
	public static void main(String[] args) {
		
	
	String st1="hi good morning to every one";
	
	StringBuffer sb= new  StringBuffer();
	String finalw []=st1.split(" ");
	
	for(String atr2:finalw)
	{
char [] ch=atr2.trim().toCharArray();
ch[0]=Character.toUpperCase(ch[0]);
atr2=new String(ch);
sb.append(atr2).append(" ");
}
	
System.out.println("Result ::"+sb.toString().trim());	
}	
}

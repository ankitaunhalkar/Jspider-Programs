package com.commonQuestions;

public class UsingEQUALS {
public static void main(String[] args) {
	String s="Hindu";
	String s1=new String("Hindu");
	System.out.println("using EQUALS :"+s.equals(s1));
	System.out.println("using == :"+(s==s1));
}
}

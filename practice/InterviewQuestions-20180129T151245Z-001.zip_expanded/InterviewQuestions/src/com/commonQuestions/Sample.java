package com.commonQuestions;

public class Sample {
public static void main(String[] args) {
	String st="(ar+=eyt-:)vb?;";
	
	String str="";
	char[] h=st.toCharArray();
	for (int i = 0; i < h.length; i++) {
		
		if(h[i]<65&& h[i]<97){
			str=str+h[i];
		}
	}
	System.out.println(str);
	
	StringBuilder builder=new StringBuilder(str);
	
	System.out.println(builder.reverse());
			}
}

package com.strings;

public class MakesVowelsCaps {
public static void main(String[] args) {
	char[] str="JSPIDERS".toCharArray();//"hindureddy".toCharArray();
	for (int i = 0; i < str.length; i++) {
		
	if (str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U') 
		
		//if (str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
		{
		//str[i]=(char) (str[i]+32);
			
		str[i]=(char) (str[i]+32);
		System.out.print(str[i]);
}
		else{
		System.out.print(str[i]);
	}
	}
}
}

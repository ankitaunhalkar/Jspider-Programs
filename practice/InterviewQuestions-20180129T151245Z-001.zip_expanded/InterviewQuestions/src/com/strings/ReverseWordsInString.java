package com.strings; 

public class ReverseWordsInString {
	public static void main(String[] args) {
		String str="how are you  girl";
		System.out.println(str);
		String temp="";
		String fin="";
		for (int i = str.length()-1; i >=0 ; i--) {
			
			temp+=i!=0?str.charAt(i):str.charAt(i)+" ";
			
			if (str.charAt(i)==' '||i==0) {
				for (int j = temp.length()-1; j >=0 ; j--) {
					fin+=temp.charAt(j);
					
				}
				temp="";
			}
					}
		System.out.println(fin);

	}

}


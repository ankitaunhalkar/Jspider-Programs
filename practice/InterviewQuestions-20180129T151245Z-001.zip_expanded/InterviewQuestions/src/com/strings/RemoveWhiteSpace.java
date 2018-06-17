package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
//		String strWSpace=str.replaceAll("//s", "");
//		System.out.print(strWSpace);
		
		char ch[]=str.toCharArray();
		//StringBuffer sb=new StringBuffer();
		StringBuilder sbu=new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]!=' ') && (ch[i]!='\t'))//
			{
				sbu.append(ch[i]);
				//sb.append(ch[i]);
			}
		}
		//System.out.print(sb);
		System.out.println(sbu);
	}
}
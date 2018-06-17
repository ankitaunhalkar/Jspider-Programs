package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringReplaceSpclSymbolBySpace {

	public static void main(String[] args) {
		String s="this.is<test";
		
		char c[]=s.toCharArray();
		
		//for(int i=0;i<c.length;i++){
		//	System.out.print(c[i]);
		//}System.out.println();
		for(int i=0;i<c.length;i++){
			if(c[i]<97){
				c[i]=32;
			}
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
		
	}
}

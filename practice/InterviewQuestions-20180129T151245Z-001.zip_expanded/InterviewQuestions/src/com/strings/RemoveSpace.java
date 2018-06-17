package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		char[] c=s1.toCharArray();
		int l=c.length;
		//System.out.println(l);
		for(int i=0;i<l;i++)
		{
			if(c[i]==' ')
			{
				int pos=i;
				for(int j=i+1;j<l;j++)
				{	
			c[pos]=c[j];	
			pos++;
				}
				l--;
				
				//System.out.println(l);
			}
				
		}
		System.out.println("After  removing space :");
		for(int i=0;i<l;i++)
		System.out.print(c[i]);
		
		

	}

}
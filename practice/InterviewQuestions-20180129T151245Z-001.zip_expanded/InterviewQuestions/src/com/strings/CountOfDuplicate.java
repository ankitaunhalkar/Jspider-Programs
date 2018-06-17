package com.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountOfDuplicate {
	static void duplicate(String word)
	{
		char[] c=word.toCharArray();
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		for(Character c1:c)
		{
			if(h1.containsKey(c1))
			{
				h1.put(c1,h1.get(c1)+1);
			}
			else
			{
				h1.put(c1,1);
			}
		}
	Set<Map.Entry<Character,Integer>> entryset=h1.entrySet();
	
	System.out.println("Number of duplicate ::");
	
	for(Map.Entry<Character,Integer> enter:entryset)
	{
		if(enter.getValue()>1)
		{
			System.out.println(enter.getKey()+":"+enter.getValue());
		}
	}
		
	}
	public static void main(String[] args) {
		System.out.println("enter the string");
		
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		duplicate(s1);
	}

}

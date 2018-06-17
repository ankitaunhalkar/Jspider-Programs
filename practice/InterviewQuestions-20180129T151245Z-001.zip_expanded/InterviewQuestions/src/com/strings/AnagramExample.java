package com.strings;

import java.util.Arrays;

public class AnagramExample {
	static void isAnagram(String s1,String s2)
	{
			String copys1=s1;//"MY NAME IS SABA";//s1.replace("\\s", "");
		String copys2=s2;//"my name is saba";//s2.replace("\\s", "");
		//seting status is true 
		boolean status=true;
		if (copys1.length()!=copys2.length()) {
			// if both String are not same lenth set status as false
			status=false;
			
			
		}else
		{
			char [] s1Array=copys1.toLowerCase().toCharArray();
			char [] s2Array=copys2.toLowerCase().toCharArray();
			//sorting the s1Array and s2Array 
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			//checking both arrays are equal or not 
			status=Arrays.equals(s1Array, s2Array);
			
		}
		if (status) 
		{
System.out.println(s1+" AND "+s2+" :: are the anagrams" );
		}else
		{
			System.out.println(s1+" and "+s2+" are not  anagrams" );
			}
		}
	public static void main(String[] args) {
		isAnagram("malayalam is langauge", "Mmaaaally Si laanggue");
	}

}


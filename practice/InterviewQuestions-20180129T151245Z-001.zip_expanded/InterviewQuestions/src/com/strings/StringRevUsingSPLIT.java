package com.strings;

import java.util.Arrays;

public class StringRevUsingSPLIT {
	public static void main(String args[]){
		String st="am,the,citizen,of,india";
	    String str[] = st.split(",");//"tcs is in whitefield".split(" ");
	    
	    String finalStr="";
	    
	    int length=str.length;
	    System.out.println(length);
	    
	        for(int i = str.length-1; i>= 0 ;i--){
	        	//finalStr=finalStr+str[i]+" ";
	        	
	            finalStr += str[i]+" ";
	        }
	        System.out.println(finalStr.trim());
	    
	
	
	/*StringBuffer b=new StringBuffer("am citizen of india");
	System.out.println(b.reverse());*/
	}

}
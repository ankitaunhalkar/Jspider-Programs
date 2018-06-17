package com.commonQuestions;

import java.util.Arrays;

public class StringRevUsingSPLIT {
	public static void main(String args[]){
	    String str[] = "He,is,the,one".split(",");//"tcs is in whitefield".split(" ");
	    String finalStr="";
	        for(int i = str.length-1; i>= 0 ;i--){
	            finalStr += str[i]+" ";
	        }
	        System.out.println(finalStr);
	    }
	}
package com.commonQuestions;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
	public class CountOfDuplicate {
		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		int n=89;
		int temp=0;
		n=sc.nextInt();
		int n1[]= new int[n];
		
		while (n>0) {
			n1[temp++]=n%2;
			n=n/2;
		}
		
		for (int i = temp-1; i >=0; i--) {
			System.out.print(n1[i]);
		}	

	}

	}
		
		
	
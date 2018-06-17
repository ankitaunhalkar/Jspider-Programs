package com.commonQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SorthingUsingBubblesort {
public static void main(String[] args) throws  IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("size of an array?");
	int n=Integer.parseInt(br.readLine());
	System.out.println(n);
	int[] arr=new int[n];
	for (int i = 0; i < n; i++) {
		System.out.println("enter the element :");
		arr[i]=Integer.parseInt(br.readLine());
		//System.out.println(ar[i]);
			}
	for (int i : arr) {
		System.out.println(i);
	}
	int temp ;
	int limit=n-1;//0-(n-1)
	boolean flag=false;
	System.out.println("----------------------------");
	for (int i = 0; i < limit; i++) {
		for (int j = 0; j < limit-i; j++) {
			if(arr[j]>arr[j+1]){
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			flag=true;
			}
		}
		if(flag==false)
			break;
		else
			flag=false;
	}
	
	System.out.println("elements aftr sorting:");
	for (int i =0; i<n;i++) {
		System.out.println(arr[i]);
	}
}
}
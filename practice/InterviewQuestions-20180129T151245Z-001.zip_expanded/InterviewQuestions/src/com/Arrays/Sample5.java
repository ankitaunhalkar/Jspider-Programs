package com.Arrays;

public class Sample5 {
public static void main(String[] args) {
	int sum=10;
	for (int i = 0,j=0; i <10&j<10; ++i,j=i+1) {
		sum+=i;
		System.out.print(sum+" ");
		//It will print :10 11 13 16 20 25 31 38 46 
	}
}
}

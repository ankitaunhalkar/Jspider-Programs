package com.Arrays;

public class Sample3 {
public static void main(String[] args) {
	int x=50;
	int y=60;
	
	if ((y=1)==x) {// y variable is re-initialized 
		System.out.println(y);
	}
	else{
		System.out.println(++y);//it will print 2
	}
}
}

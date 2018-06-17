package com.Arrays;

public class Sample {
public static void main(String[] args) {
	int i=2;
	int j=0;
	for (; j <20;++j) {
		if (j%i!=0) {
			continue;
		}
		else if(j==20){
			break;
		}
		else{
			System.out.print(j+" ");//it will print :0 2 4 6 8 10 12 14 16 18 
		}
	}
}
}

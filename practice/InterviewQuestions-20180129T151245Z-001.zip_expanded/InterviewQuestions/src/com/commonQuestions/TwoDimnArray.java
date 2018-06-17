package com.commonQuestions;

public class TwoDimnArray {
public static void main(String[] args) {
	int arr[][]={{2,23,12,15},{2,12,4,5}};
	int count=0;
	for (int i = 0; i <2; i++) {
		for (int j =0; j <4; j++) {
			
			System.out.print(arr[i][j]+"\t");
			
		}
		System.out.println();
		
	}
	System.out.println("---------------");
	for (int i = 0; i <2; i++) {
		for (int j =0; j <4; j++) {
			if (arr[i][j]==12) {
				count++;
				if (count==1) {
					System.out.println("first position of 12 :"+(++i)+" row"+(++j)+" column");
					break;
				}
				
			}
}
}
}
}
package com.commonQuestions;

import java.util.Arrays;

public class SortTheCHARarray {
public static void main(String[] args) {
	char[] arr={'e','a','d','b','f'};
	System.out.print("Original Array : ");
    for(int index=0; index < arr.length ; index++)
      System.out.print("  "  + arr[index]);
    System.out.println();
    System.out.println("aftr sorting :");
    Arrays.sort(arr);
    
    for(int index=0; index < arr.length ; index++)
      System.out.print("  "  + arr[index]);
}
}

package com.dsa.sorting.algorithms;

import java.util.Arrays;

public class InsertionSortTest {

	public static void main(String[] args) {
		
		int input[] = new int[] { 5, 15, 10, 8, 45, 23, 1 };
		int len=input.length;
		int temp=0,k=0,swap=0;
		System.out.println("input:"+ Arrays.toString(input));
		
		for(int i=1;i<len;i++) {
			   k=i;
			for(int j=k-1;j>=0;j--) {
				
				if(input[k] < input[j] ) {

					temp=input[k];
					input[k]=input[j];
					input[j]=temp;
					k--;
					swap++;
				}//if

			}//inner for
			System.out.println("Iteartion:"+(i)+"  "+ Arrays.toString(input));
		}//outer for
		
		System.out.println("Final Output:"+ Arrays.toString(input));

		System.out.println("swap:"+ swap);
	}//main()

}//class

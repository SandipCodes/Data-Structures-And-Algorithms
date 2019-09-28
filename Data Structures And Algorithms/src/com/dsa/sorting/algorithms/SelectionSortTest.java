package com.dsa.sorting.algorithms;

import java.util.Arrays;

public class SelectionSortTest {

	public static void main(String[] args) {
		
		int input[] = new int[] { 5, 15, 10, 8, 45, 23, 33 };
		int len=input.length;
		int min_index=0;
		int temp=0;
		boolean flag=false;
		
		System.out.println("input:"+ Arrays.toString(input));
		
		for(int i=0;i<len-1;i++) {
			min_index=i;
			
			for(int j=i+1;j<len;j++) {
				
				if(input[min_index] > input[j]) {
					min_index=j;
					//j=min_index+1;
							
				}//for

			}//for
	
	        if(min_index!=i) {
	        	temp=input[i];
				input[i]=input[min_index];
				input[min_index]=temp;	
	        }
			System.out.println("min_index:"+min_index+ "   iteration:"+(i+1)+"  "+ Arrays.toString(input));
		}//outer for	
		System.out.println("final output:"+ Arrays.toString(input));
		
	}//main()
}//class

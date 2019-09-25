package com.dsa.sorting.algorithms;

import java.util.Arrays;

public class BubbleSortTest {

	public static void main(String[] args) {
	
		//int input[]=new int[] {14,13,8,6,12,10};//j-k
		//int input[]=new int[] {10,20,30,40,50};//j-k
		int input[]=new int[] {10,20,30,50,40};//j-k
		
		int len=input.length;
		int temp=0;
		boolean flag;
		System.out.println("input:"+ Arrays.toString(input));
		
		
		for(int k=0;k<len;k++) {
	           flag=false;		
			for(int j=len-1,i=j-1;i>=k ;j--,i--) {
				
				if(input[i] > input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
					flag=true;
				}//if
				
				
			}//inner for
			System.out.println("iteration:"+(k+1)+" ::"+Arrays.toString(input));
	
			if(flag==true) {
				continue;
			}
			else {
				break;
			}
		   
		}//outer for
	
		
/*
		for(int k=len-1;k>=0;k--) {
			
			for(int j=0,i=j+1;j<k ;j++,i++) {
				
				if(input[j] > input[i]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}//if
				//System.out.println("iteration:"+k+" ::"+Arrays.toString(input));
			}//inner for
			System.out.println("iteration:"+k+" ::"+Arrays.toString(input));
		}//outer for
*/	
	}//main()

}//class

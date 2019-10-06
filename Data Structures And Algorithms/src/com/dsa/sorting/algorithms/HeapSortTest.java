package com.dsa.sorting.algorithms;

import java.util.Arrays;

public class HeapSortTest {

	public static void main(String[] args) {


		int input[] = new int[] { 8,15,10,16,50,20,30,60 };
//		int input[] = new int[] {1, 10, 2, 3, 4, 1, 2, 100, 23, 2}; 

		int len = input.length;

		System.out.println("Input:"+Arrays.toString(input));
		heapSort(input,len);
		System.out.println("Output:"+Arrays.toString(input));
	}// main()
	
	private static void heapSort(int input[],int len) {
		
		int i,temp;
		
		for(i=len/2-1;i>=0;i--) {
			heapify(input,len,i);
		}//for
		
		for(i=len-1;i>=0;i--) {
			temp=input[0];
			input[0]=input[i];
			input[i]=temp;
			heapify(input,i,0);
		}//for
		
	}//heapSort()
	
	private static void heapify(int input[],int len,int i) {
		int temp;
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left < len && input[left] > input[largest])
			largest=left;

		if(right < len && input[right] > input[largest])
			largest=right;
		
		if(largest !=i) {
			
			temp=input[i];
			input[i]=input[largest];
			input[largest]=temp;
			
			heapify(input,len,largest);
		}//if
		
	}//heapify()
	
}// class

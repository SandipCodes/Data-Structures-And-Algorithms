package com.dsa.sorting.algorithms;

import java.util.Arrays;

public class MergeSortTest {

	public static void main(String[] args) {

		int input[] = { 5, 15, 10, 8, 45, 23, 12, 33, 2 };
		int len = input.length - 1;
		int start = 0, end = len;

		System.out.println("input:"+ Arrays.toString(input));
		
		split(input, 0, input.length-1);
		
		System.out.println("output:"+ Arrays.toString(input));
		
	}//main()

	public static void split(int input[], int start, int end) {

				
		if (start < end) {
			int mid= (start + end)/2;

			split(input, start, mid);
			split(input, mid + 1, end);
            merge(input, start, mid, end);

		} // if

	}// split()

	public static void merge(int input[], int start, int mid, int end) {
		int i, j, k;

		int n1 = mid - start + 1;
		int n2 = end - mid;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (i = 0; i < n1; ++i) {
			leftArray[i] = input[start + i];
		}
		for (j = 0; j < n2; ++j) {
			rightArray[j] = input[mid + 1 + j];
		}

		i = 0;
		j = 0;
		k = start;

		while (i < n1 && j < n2) {

			if (leftArray[i] <= rightArray[j]) {

				input[k] = leftArray[i];
				i++;
			} else {
				input[k] = rightArray[j];
				j++;
			}k++;
		} // while

		//copying the remaining element of leftArray  in the final array if there is any  
		while (i < n1) {

			input[k] = leftArray[i];
			i++;
			k++;
		}//while
		
		//copying the remaining element of rightArray  in the final array if there is any  
		while (j< n2) {

			input[k] = rightArray[j];
			j++;
			k++;
		}//while
		
		System.out.println(Arrays.toString(input));
	}//merge()

}// class

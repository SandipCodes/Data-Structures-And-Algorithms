package com.dsa.sorting.algorithms;

import java.util.Arrays;

public class MergeSortTest1 {

	
	public void merge(int input[], int beg, int mid, int end) {


		int l = (mid-beg + 1);
		int r = (end-mid);

		int leftArray[] = new int[l];
		int rightArray[] = new int[r];

		for (int i = 0; i<l; ++i) {
			leftArray[i] = input[beg + i];
		}
		for (int j = 0; j < r; ++j) {
			rightArray[j] = input[mid + 1 + j];
		}
		
		int i = 0,j = 0;
		int k = beg;

		while (i < l && j < r) {

			if (leftArray[i] <= rightArray[j]) {
				input[k] = leftArray[i];
				i++;
			} else {
				input[k] = rightArray[j];
				j++;
			}
			k++;
		} // while

		while (i < l) {
			input[k] = leftArray[i];
			i++;
			k++;
		}
		//while
		while (j < r) {

			input[k] = rightArray[j];
			j++;
			k++;
		}//while
		
		//System.out.println(Arrays.toString(input));

	}

	public void sort(int input[], int beg, int end) {

		if (beg < end) {

			int mid =((beg + end)/2);

			//System.out.println("mid::"+ mid);
			sort(input, beg, mid);
			sort(input,mid+1, end);
			merge(input, beg, mid, end);
		}
	}

	public static void main(String[] args) {

		int input[] = { 5, 15, 10, 8, 45, 23, 12, 33, 2, 55 };

		int beg = 0;
		int end = input.length - 1;

		System.out.println(beg + " " + end);
		System.out.println("input:" + Arrays.toString(input));

		MergeSortTest1 t = new MergeSortTest1();
		t.sort(input, 0, input.length-1);
		System.out.println("output:" + Arrays.toString(input));

	}

}

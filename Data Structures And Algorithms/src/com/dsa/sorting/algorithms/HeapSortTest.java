package com.dsa.sorting.algorithms;

import java.util.Arrays;

public class HeapSortTest {

	public static void main(String[] args) {

		int input[] = new int[] { 5, 2, 7, 3, 6, 1, 4 };

		int len = input.length;
		int temp, j, k, i,root;
		int heap[] = new int[len];

		System.out.println("input:" + Arrays.toString(input));
          heap[0]=input[0];
          
		for (i = 1; i < len; i++) {

			heap[i] = input[i];
			
			// maintaining the max heap tree
			j = i;
			while (j >= 0) {

				if(j <=2) {
					root=0;
				}
				else {
					root= j/2-1;
				 }
				
				if (heap[j] > heap[root]) {
					temp = heap[j];
					heap[j] = heap[root];
					heap[root] = temp;
				} // if
				else {
					break;
				}
				j = j / 2;
				
			} // while

			System.out.println("itr:" + i + "  " + Arrays.toString(input));
		} // for
	}// main()
}// class

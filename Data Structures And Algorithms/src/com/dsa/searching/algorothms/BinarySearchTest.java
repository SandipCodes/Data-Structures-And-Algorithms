package com.dsa.searching.algorothms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {

		Scanner sc = null;
		int no = 0, len = 0;
		boolean flag = false;
		int input[] = new int[] { 5, 15, 10, 8, 45, 23, 33 };
		int upper = 0, lower = 0, mid = 0,data=0;

		System.out.println("Input Array:" + Arrays.toString(input));

		Arrays.sort(input);

		System.out.println("Input Array after sorting:" + Arrays.toString(input));

		sc = new Scanner(System.in);

		if (sc != null) {
			System.out.println("Enter the data you want to search:");
			no = sc.nextInt();
		} // if

		len = input.length;
		lower = 0;
		upper = len - 1;
		
//		System.out.println(mid);

		while (lower <= upper) {
			
			mid = (lower + upper)/2 ;
			data=input[mid];
			if (no == data) {
				System.out.println("Data found at index:" + (mid));
				flag=true;
				break;
			} // if
			else if(no < data) {
                upper=mid-1;
                
			}
			else {
				lower=mid+1;
			}
		} // while

		if(flag==false) {
			System.out.println("Data not found!");
		}//if
	}// main()

}//class

package com.dsa.searching.algorothms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchTest {

	public static void main(String[] args) {

		Scanner sc = null;
		int no = 0,len=0;
		boolean flag=false;
		int input[] = new int[] { 5, 15, 10, 8, 45, 23, 33 };
     
		System.out.println("Input Array:" + Arrays.toString(input));

		sc = new Scanner(System.in);

		if (sc != null) {
			System.out.println("Enter the data you want to search:");
              no=sc.nextInt();
		}//if
		
		len=input.length;
		
		for(int i=0;i<len;i++) {
		    
			if(no==input[i]) {
				System.out.println("Data found at index:"+(i+1));
			     flag=true;
			     break;
			}//if
			
		}//for

		if(flag==false) {
			System.out.println("Data not found.");	
		}//if
	}//main()

}//class

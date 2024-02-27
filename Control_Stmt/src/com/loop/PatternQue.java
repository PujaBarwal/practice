package com.loop;

import java.util.Scanner;

public class PatternQue {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		n = sc.nextInt();
		
/*			*
		   ***
		  *****
		 *******
		*********			*/
		
		
//		for(int i=1; i <= n; i++) {
//			
//			//for space
//			for(int s = 1; s <= n-i; s++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<= 2 * i - 1; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println( );
//		}
		
		
		
		
/*
 	*
   **
  ***
 ****
*****       */		
		
	
		for(int i=1; i<=n; i++) {
			
			//for space
			for(int s=1; s < n-i; s++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<= i ; j++) {
				System.out.print("*");
			}
			
			System.out.println( );
		}
		
		
	}

}

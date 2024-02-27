package com.selection;

import java.util.Scanner;

/*
 a = a + b;
 b = a - b;
 a = a - b;
 */

public class SwapTwoNumWithoutUsingThirdVar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		
//		System.out.println("Before Swapping: " + num1 + num2);
//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;
//		System.out.println("After Swapping: " + num1 + num2);
		
		
// Using third variable
		System.out.println("Before Swapping: " + num1 + num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping: " + num1 + num2);		
		
		
//Using swap() functtion
//		System.out.println("Before Swapping: " + num1 + num2);
//		swap(num1, num2);
//		System.out.println("After Swapping: " + num1 + num2);
		
		

		
		
		
	}

	
}

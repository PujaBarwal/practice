package com.selection;

import java.util.Scanner;

//Q.4 WAP to check maximum number between two numbers

public class MaxInTwo {
	public static void main(String[] args) {
									
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
						
		if(num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		}
		else {
			System.out.println(num2 + " is greater than " + num1);
		}		
	}
}

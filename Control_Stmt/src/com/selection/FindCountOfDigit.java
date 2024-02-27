package com.selection;

import java.util.Scanner;

// Q.WAP to count digit in a given number

public class FindCountOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int count=0;
		
		while(num != 0) {
			count++;
			num = num / 10;
		}
		System.out.println("Count of number: " + count);
		
		
	}
}

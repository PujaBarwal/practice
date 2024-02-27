package com.selection;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		System.out.println("Original number: " + num);
		
		int rem=0, rev=0;
		while(num != 0) {
			rem = num % 10;
			rev = rem + 10 * rev;
			num = num / 10;
		}
		System.out.println("Reverse number: " + rev);
		
	}

}

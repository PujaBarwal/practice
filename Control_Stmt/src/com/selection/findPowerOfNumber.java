package com.selection;

import java.util.Scanner;

public class findPowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Enter a power: ");
		int pow = sc.nextInt();
		
		
		int res=1;
		for(int i=1; i <= pow; i++) {
			res = res * num;
		}
		System.out.println("Power: " + res);
		
	}	
}

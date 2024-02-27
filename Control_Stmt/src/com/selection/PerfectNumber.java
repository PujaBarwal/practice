package com.selection;

import java.util.Scanner;

//Perfect Number - addition of all the factors of number is equal to that number. e.g-6: 1+2+3=6

public class PerfectNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		
		if(num == sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
		
	}
}

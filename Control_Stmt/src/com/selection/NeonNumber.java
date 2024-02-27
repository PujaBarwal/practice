package com.selection;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int square = num * num;
		System.out.println("Square Of "+ num + ":" +square);
		
		int rem, sum=0;
		while(square != 0) {
			rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}
		
		System.out.println("Sum of digit of numbers:"+ sum);
		
		//int squareOfSum = sum * sum;
		
		if(num == sum)
			System.out.println("Neon Number");
		else
			System.out.println("Not Neon Number");
	}
}

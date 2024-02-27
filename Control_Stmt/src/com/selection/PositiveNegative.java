package com.selection;

import java.util.Scanner;

//Q.3 WAP to check weather  a number is Positive or Negative

public class PositiveNegative {
	public static void main(String[] args) {
		
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	num = sc.nextInt();
			
	if(num > 0) {
		System.out.println(num + " is Positive");
	}
	else {
		System.out.println(num + " is Negative");
	}
	}
}

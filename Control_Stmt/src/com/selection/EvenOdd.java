package com.selection;

import java.util.Scanner;

//Q.2 WAP to check weather  a number is even or odd

public class EvenOdd {
	public static void main(String[] args) {
				
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is Even");
		}
		else {
			System.out.println(num + " is Odd");
		}
	
	}

}

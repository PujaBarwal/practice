package com.selection;

import java.util.Scanner;

public class Divisibility {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		if((num % 5 == 0) || (num % 11 == 0)){
			System.out.println(num + " is divisible by 5 or 11");
		}
		else {
			System.out.println(num + " is not divisible by 5 or 11");
		}
	}

}

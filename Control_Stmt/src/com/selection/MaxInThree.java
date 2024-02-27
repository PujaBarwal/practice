package com.selection;

import java.util.Scanner;

//Q.5 WAP to check maximum number between three numbers		

public class MaxInThree {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three number: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
						
		if(num1 > num2) {
			if(num1 > num3)
				System.out.println(num1 + " is greater..." );
			else
				System.out.println(num3 + " is greater..." );
		}
		else {
			if(num2 > num3)
				System.out.println(num2 + " is greater..." );
			else
				System.out.println(num3 + " is greater..." );
		}
	}
}

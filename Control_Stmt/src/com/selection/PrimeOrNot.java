package com.selection;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		
// Program to find given number is Prime or Not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int flag = 1;
		
		for(int i=2; i < num; i++) {
			if(num % i == 0) {
				flag = 0;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println(num + " is Prime Number");
		}
		else {
			System.out.println(num + " is Not Prime Number");
		}
		
	
		
// all prime number from 1 to N
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a range: ");
//		int num = sc.nextInt();
//		int n= sc.nextInt();
//		
//		System.out.print("Prime numbers between 1 to " + n + " are: ");
//		
//		int flag = 1;
//		for(int i=1; i<=n; i++) {
//			for(int j=2; j<num; j++) {
//				if(num % i == 0) {
//					flag = 0;
//					break;
//				}
//			}
//			
//			if(flag == 1) {
//				System.out.println(num );
//			}
//			
//		}
		
		
		
	}
}

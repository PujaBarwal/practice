package com.selection;

import java.util.Scanner;

public class SwitchDoWhile2 {
	
	static void StarPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows: ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	
	static void NumberPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows: ");
		int n = sc.nextInt();
	
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		
	int n;
	
	do {
		System.out.println("1)Star Pattern");
		System.out.println("2) Number Pattern");
		System.out.println("Enter Your choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				StarPattern();
				break;
				
			case 2:
				NumberPattern();
				break;
				
			
			default:
				System.out.println("Your choice is wrong");
			
		}
		
		System.out.println("Do you want to continue if yes then press 1");
		n = sc.nextInt();
		
		} while(n==1);
	
	
	}

}

 package com.selection;

import java.util.Scanner;

public class Switch {
	//1. Find Fibonacci
	static void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of terms: ");
		int terms = sc.nextInt();
		//int terms = new Scanner(System.in).nextInt();
		
		int num1=0, num2 = 1, num3;
		System.out.print(num1 + " " + num2 + " ");
		
		for(int i=1; i <= terms - 2; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}
	
	
	//3. Find HCF
		static int findHCF(int num1, int num2) {
			int hcf = 1;
			
			for(int i=1; i<=num1 && i<=num2; i++) {
				if(num1 % i == 0 && num2 % i == 0) {
					hcf = i;
				}
			}
			
			return hcf;	
		}
	
		
	//2. Find LCM
	static int findLCM(int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter two number: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		int hcf = findHCF(num1, num2);
		int lcm = (num1 * num2)/ hcf;
		
		return lcm;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
//	int choice;
//	Scanner sc = new Scanner(System.in);
	int n;
	
	
	int num1 = 8, num2 =16;
	
	do {
		System.out.println("1)Fibonacci Series");
		System.out.println("2) LCM");
		System.out.println("3) HCM");
		System.out.println("Enter Your choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				fibonacci();
				break;
				
			case 2:
				System.out.println("LCM: " + findLCM(num1, num2));
				break;
				
			case 3:
				System.out.println("HCF: " + findHCF(num1, num2));
				break;
				
			default:
				System.out.println("Your choice is wrong");
			
		}
		
		System.out.println("Do you want to continue if yes then press 1");
		n = sc.nextInt();
		
		
		
	} while(n==1);
	
	
	
	
	
	}
}

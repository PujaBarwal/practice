package com.selection;

import java.util.Scanner;

public class SwitchDoWhile {
	
	static void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of terms: ");
		int terms = sc.nextInt();
		
		int n1=0, n2=1, n3;
		
		System.out.println(n1+" "+n2+" ");
		 
		for(int i=1; i<=terms-2; i++) {
			n3 = n1 + n2;
			System.out.println(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
		
	}
	
	
	static int findHCF(int num1, int num2){
		int hcf=1;
		
		for(int i=1; i<=num1 && i<=num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}
		
		return hcf;
	}
	
	
	static int findLCM(int num1, int num2){
		int hcf = findHCF(num1, num2);
		int lcm = (num1 * num2) / hcf;
		return lcm;
	}
	
	
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		int num1 = 8, num2 =16;
		
		do {
			System.out.println("1.Fibonacci");
			System.out.println("2.LCM");
			System.out.println("3.HCF");
			System.out.println("Enter Your Choice:");
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
			}
			
			System.out.println("Do you want to continue...If Yes then press 1");
			n = sc.nextInt();
			
		}while(n==1);
	}
}

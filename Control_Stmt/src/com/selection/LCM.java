package com.selection;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		int num1=12, num2=15;
		
		int lcm = 0;
		
		int max = num1 > num2 ? num1 : num2;
		
		while(true) {
			 if(max % num1 == 0 && max % num2 == 0) {
				 lcm = max;
				 break;
			 }
			 max++;
		 }
		 System.out.println("LCM: " + lcm);
		
		
//		int num1, num2;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter two numbers:");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		int lcm =0 ;
//		
//		int max = num1 > num2 ? num1 : num2;
//		
//		while(true) {
//			if(max % num1 == 0  && max % num2 == 0) {
//				lcm = max;
//				break;
//			}
//			max++;
//		}
//		System.out.println("LCM: " + lcm);
	}
}

package com.selection;

import java.util.Scanner;

//Q.6 WAP to check weather a year is leap or not			

public class LeapYear {
	public static void main(String[] args) {
				
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		year = sc.nextInt();
			
//		if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) )
//			System.out.print(year + " is a leap year");
//		else
//			System.out.print(year + " is not a leap year");
			
			// Or
			
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				System.out.print(year + " is a leap year");
			}
			else {
				System.out.print(year + " is not a leap year");
			}
		}
		else {
			if(year % 4 == 0) {
				System.out.print(year + " is a leap year");
			}
			else {
				System.out.print(year + " is not a leap year");
			}
		}
		
		
	}
}

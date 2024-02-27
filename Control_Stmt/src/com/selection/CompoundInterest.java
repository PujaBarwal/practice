package com.selection;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter the principal amount: ");
    double principal = sc.nextDouble();
    System.out.print("Enter the annual interest rate (as a decimal): ");
    double rate = sc.nextDouble();
    System.out.print("Enter the time period (in years): ");
    double time = sc.nextDouble();
    System.out.print("Enter the number of times interest is compounded per year: ");
    int n = sc.nextInt();

    // Calculate compound interest
    double compoundInterest = principal * Math.pow((1 + rate / n), n * time) ;

    // Display the result
    System.out.println("Compound Interest: " + compoundInterest);

	}
}

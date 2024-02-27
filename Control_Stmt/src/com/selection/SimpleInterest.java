package com.selection;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the principal amount: ");
	        double p = sc.nextDouble();
	        System.out.print("Enter the rate of interest (as a decimal): ");
	        double r = sc.nextDouble();
	        System.out.print("Enter the time period (in years): ");
	        double t = sc.nextDouble();
	        
	        double simpleInterest = (p * r * t) / 100;
	        
	        System.out.println("Simple Interest for" +p+ " is: " + simpleInterest);
	}

}

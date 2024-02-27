package com.selection;

import java.util.Scanner;

public class CalculateBasicSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic salary:");
		int bs = sc.nextInt();
		
		int da, hra, gs;
		
		da = (bs*30)/100;
		hra = (bs*30)/100;
		gs = bs + da + hra;
	
		System.out.println("Total Salary Of Employee:" + gs);
	}
}

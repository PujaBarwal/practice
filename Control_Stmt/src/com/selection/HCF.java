package com.selection;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int hcf=1;
		
		for(int i=1; i<=num1 && i<=num2 ; i++) {
			if(num1 % i == 0  && num2 % i == 0) {
				hcf = i;
			}
		}
		System.out.println("HCF: " + hcf);
	}

}

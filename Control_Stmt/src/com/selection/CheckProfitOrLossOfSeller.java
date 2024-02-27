package com.selection;

import java.util.Scanner;

public class CheckProfitOrLossOfSeller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Selling Price: ");
		int sp = sc.nextInt();
		
		System.out.println("Enter Cost Price: ");
		int cp = sc.nextInt();
		
		if(sp > cp) {
			System.out.println("Yehhh....\nProfit: " + (sp-cp));
		}
		else {
			System.out.println("Ooopss!!!.... \nLoss:" + (cp-sp));
		}
		
	}
}

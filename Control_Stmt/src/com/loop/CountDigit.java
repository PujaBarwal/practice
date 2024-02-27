package com.loop;

import java.util.Scanner;

public class CountDigit {
	int findCount(int num) {
		int count=0;
		while(num!= 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		CountDigit cd = new CountDigit();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int result = cd.findCount(num);
		
		System.out.println("Count is: " + result);
		
	}

}

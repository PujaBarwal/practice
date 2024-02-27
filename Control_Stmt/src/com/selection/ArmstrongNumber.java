package com.selection;

import java.util.Scanner;

// 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

public class ArmstrongNumber {
	// Fun to count no. of digits in number
	static int findCount(int num) {
		int count=0;
		while(num != 0 ) {
			count++;
			num /= 10;
		}
		return count;
	}
	
	//Fun to find power of given number
	static int findPower(int num, int power) {
		int res=1;
		for(int i=1; i<=power; i++) {
			res = res * num;
		}
		return res;
	}
	
	//Function to find Armstrong number
	static void findArmstrong(int num) {
		int temp = num;
		int pow = findCount(num);
		
		int sum = 0;
		
		while(num != 0 ) {
			int digit = num % 10;
			sum = sum + findPower(digit, pow);
			num = num / 10;
		}
		
		if(temp == sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		findArmstrong(num);
		
	}
}

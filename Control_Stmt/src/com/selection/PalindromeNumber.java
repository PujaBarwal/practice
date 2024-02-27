
package com.selection;

import java.util.Scanner;

// Palindrome Number - if reversing number is same as number then it is Palindrome Number.
//					   e.g 1) 121 - reverse(121) is palindrome number.
//							2) 231 - reverse(132) is not Palindrome Number
public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter Number: ");
		num = sc.nextInt();
		
		int rem=0, rev=0;
		int temp = num;
		while(num != 0) {
			// logic for reverse number
			rem = num % 10;
			rev = rem + 10 * rev;
			num = num / 10;
		}
		
		if(temp == rev) 
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
			
			
		
	}

}

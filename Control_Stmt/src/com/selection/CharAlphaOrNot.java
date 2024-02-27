package com.selection;

import java.util.Scanner;

//Q.7 WAP to check weather a character is alphabet or not

public class CharAlphaOrNot {
	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		ch = sc.next().charAt(0);							// to take char input we use charAt(0)
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
			System.out.println(ch + " is a character");
		else
			System.out.println(ch + " is not a character");
		
		
//		if(ch >= 'a' && ch <= 'z')
//			System.out.println("Small Alphabet");
//		else if(ch >= 'A' && ch <= 'Z')
//			System.out.println("Capital Alphabet");
//		else if(ch >= 0 && ch <= 9)
//			System.out.println("Digit");
//		else 
//			System.out.println("Special Symbol");
		
	}
}

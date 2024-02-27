package com.selection;

import java.util.Scanner;

//Q.9 WAP to check weather a character is in Uppercase or lowercase 

public class UpperLowerCase {
	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		ch = sc.next().charAt(0);	  				// to take char input we use charAt(0)//		

		if(ch>='a' &&  ch<='z' )
			System.out.println(ch + " is in lowercase");
		else
			System.out.println(ch + " is in UPPERCASE");		
		
	}
}

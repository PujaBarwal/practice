package com.selection;

import java.util.Scanner;

//Q.8 WAP to input any alphabet & check wheater it is vowel or consenant

public class VowelConsenant {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		ch = sc.next().charAt(0);							// to take char input we use charAt(0)
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch + " is a vowel");
		else
			System.out.println(ch + " is Consenant");
	}
}

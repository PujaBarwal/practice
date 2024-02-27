package com.selection;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
//Q.WAP to find fibonacci Series till 'n' terms		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of terms: ");
		int terms = sc.nextInt();
		//int terms = new Scanner(System.in).nextInt();		//we can also declare scanner in one like this
		
		int num1=0, num2 = 1, num3;
		System.out.print(num1 + " " + num2 + " ");
		
		for(int i=1; i <= terms - 2; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			
			num1 = num2;
			num2 = num3;
		}
		
		
		
		
//Q.WAP to find sum of even numbers from series		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number:");
//		int num = sc.nextInt();
//		int f = 0, s = 1, t;
//		int sum = 0;
//		System.out.print("Fabbonacci series is: " + f + " " + s + " ");
//		for(int i = 1; i <= num-2; i++) {
//			t = f + s;
//			System.out.print(t + " ");
//			f = s;
//			s = t;
//			
//			if(t%2==0) {
//				sum = sum + t;
//			}
//		}
//		//4 = 0 1 1 2 3 5 8 
//		System.out.println("\nSum of Even num:" + sum);

		
		
			
		
		
	}

}

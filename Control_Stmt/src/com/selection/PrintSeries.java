package com.selection;

import java.util.Scanner;

public class PrintSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number: ");
//		int a = sc.nextInt();
//		System.out.println("Enter number of terms: ");
//		int terms = sc.nextInt();
//	
//		double sum=0.0;
		
		
//first seires :- a^2 + a^2/2 + a^2/3 + …… + a^2/10
//			e.g:  2^2 + 2^2/2 + 2^2/3 + …… + 2^2/10
		
//		for(int  i=1; i<=terms; i++) {
//			sum = sum + Math.pow(a,2)/i ;
//		}
//		System.out.println("Sum:"+ sum);
		
		
		
//second series:- a + a^2/2 + a^3/3 + ...... + a^10/10
//		    e.g:  2^2 + 2^2/2 + 2^3/3 + …… + 2^10/10
		
//		for(int  i=1; i<=terms; i++) {
//			sum = sum + Math.pow(a,i)/i ;
//		}
//		System.out.println(sum);
		
	
		
		
//third series:- x - x^2/3 + x^3/5 - x^4/7 + .... + n
		System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        double sum = 0.0;
        int a = 1;
        for (int i = 1, j = 1; i <= n; i++, j+=2) {
            double term = Math.pow(x, i) / j * a;
            sum += term;
            a *= -1;
        }
        System.out.println("Sum = " + sum);
		
		
	}
}

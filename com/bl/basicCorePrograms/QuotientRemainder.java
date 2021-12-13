package com.bl.basicCorePrograms;

import java.util.Scanner;

public class QuotientRemainder {
	
	public static void main(String[] args) {
	
		System.out.println("Enter the dividend: ");
		Scanner sc1 = new Scanner(System.in);
	    int dividend = sc1.nextInt();
	    System.out.println("Enter the divisor: ");
	    Scanner sc2 = new Scanner(System.in);
	    int divisor = sc2.nextInt();
	    
	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;
	    System.out.println("Remainder is: " + remainder + "   Quotient is: " +quotient);
	    
	}

}

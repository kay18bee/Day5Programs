package com.bl.basicCorePrograms;

import java.util.Scanner;

public class NumbersSwap {
	
	public static void main(String[] args) {
	
		System.out.println("Enter the first number. ");
		Scanner sc1 = new Scanner(System.in);
	    int num1 = sc1.nextInt();
	    System.out.println("Enter the second number. ");
	    Scanner sc2 = new Scanner(System.in);
	    int num2 = sc2.nextInt();
	
	    int t = num1;
	    num1 = num2;
	    num2 = t;
	    System.out.println("Now the first number is " + num1 + ".");
	    System.out.println("and the second number is " + num2 + ".");
	
	}

}

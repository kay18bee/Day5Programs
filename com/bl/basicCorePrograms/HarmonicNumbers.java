package com.bl.basicCorePrograms;

import java.util.Scanner;

public class HarmonicNumbers {
	
	public static void main(String[] args) {
	    double answer = 0;
		System.out.println("Enter the Nth number upto where you want the harmonic value.");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N > 0) 
		{
			for(double i = 1; i <= N; i++) 
			{
				answer = answer + 1 / i;
			}
			
		}else 
		{
			System.out.println("Please enter a postive number.");
		}
		System.out.println("The Nth harmonic value is: " + answer);
	}

}

package com.bl.basicCorePrograms;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the year you want to check.");
		
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		if(answer > 1000 && answer % 4 == 0) 
		{
			System.out.println("It is a leap year.");
		}
		else if(answer >1000 && answer % 4 != 0) 
		{
			System.out.println("It is not a leap year.");
		}
		else
		{
			System.out.println("Invalid input.");
		}
		
	}

}

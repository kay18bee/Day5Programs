package com.bl.basicCorePrograms;

import java.util.Scanner;

public class CoinFlip {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of times you want to flip the coin.");
	
		Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        if (choice > 0)
        {	
        for (int i = 0; i <= choice; i++)
        {
		
		double number = (Math.random()*1 );
		
		if(number < 0.5)
			{
			  System.out.println("It's HEADS.");
			 
			}
		else 
			{
			  System.out.println("It's TAILS.");
			}
        }
        }
        else 
        {
        	System.out.println("Invalid output. Please run the program again and enter a positive value");
        }
        
     }

}
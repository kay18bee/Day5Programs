package com.bl.basicCorePrograms;

import java.util.Scanner;

public class Factors {
	
	public static void main(String[] args) {
	
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number you want to find the prime factors for.");
		int input = sc.nextInt(); //15
		
		for(int i = 2; i*i <= input; i++)  
		{
	       while(input%i == 0)    
	       {
	            System.out.println(i); 
	            input = input/i;     
	       }
			
		}
		
	}

}

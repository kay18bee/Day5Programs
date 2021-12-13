package com.bl.basicCorePrograms;

import java.util.Scanner;

public class HighestNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the first number. ");
		Scanner sc1 = new Scanner(System.in);
	    int num1 = sc1.nextInt();
	    System.out.println("Enter the second number. ");
	    Scanner sc2 = new Scanner(System.in);
	    int num2 = sc2.nextInt();
	    System.out.println("Enter the third number. ");
	    Scanner sc3 = new Scanner(System.in);
	    int num3 = sc2.nextInt();
	    
	    if(num1 > num2) 
	    {
	    	if(num1 > num3) 
	    	{
	    		System.out.println("The first number is the highest which is " + num1);
	    	}
	    	else if(num3 > num1) 
	    	{
	    		System.out.println("The third number is the highest which is " + num3);
	    	}
	    }
	    else 
    	{
    		System.out.println("The second number is the highest which is " + num2);
    		
    	}
		
	}

}

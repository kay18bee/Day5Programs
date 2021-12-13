package com.bl.basicCorePrograms;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
	
		System.out.println("Enter the number you want to check for even or odd. ");
		Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    
	    if(number != 0) 
	    {
		    if(number % 2 == 0) 
		    {
		    	System.out.println("Number is even.");
		    }
		    else
		    {
		    	System.out.println("Number is odd.");
		    }
	    }
	    else
	    {
	    	System.out.println("Number is neither even nor odd.");
	    }
	}

}

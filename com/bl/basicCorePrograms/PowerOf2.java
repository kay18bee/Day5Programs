package com.bl.basicCorePrograms;

import java.util.*;

public class PowerOf2 {
	
	public static void main(String[] args) {
	    
		System.out.println("Enter the number upto where you want to print check.");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= N ; i++)
		{
				System.out.println((int)Math.pow(2, i));
		}
		
	}

}

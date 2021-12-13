package com.bl.basicCorePrograms;

import java.util.Scanner;

public class AlphabetChecker {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the alphabet you want to check. ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
		{
	         System.out.println("The provided alphabet is a vowel.");
	    }
		else
		{
	         System.out.println("The provided alphabet is a consonant.");
	    }
	}

}

package com.challenger.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Given an integer x, return true if x is a 
//palindrome and false otherwise.


public class Challenge2 {

	public static void main(String[] args) {
		
		System.out.println("This is my second challenge");
		
		Scanner reader = new Scanner(System.in);
		
		int input = reader.nextInt();
		
		System.out.println("Input is ::" + input);
		
		int pallindrome= 0, number=input;
		
		for (;number>0;)
		{
			pallindrome = (pallindrome*10) + (number%10);
			number=number/10;
		}

		if (pallindrome == input)
			System.out.println("You entered a pallindrome : |" + pallindrome + "|");
		else
			System.out.println(input + " is not a pallindrome !!");
		
		
	}


}
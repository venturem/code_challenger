package com.challenger.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000 
//For example, 2 is written as II in Roman numeral, just two ones added together. 
//12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//Roman numerals are usually written largest to smallest from left to right. 
//However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//I can be placed before V (5) and X (10) to make 4 and 9.  
//X can be placed before L (50) and C (100) to make 40 and 90.  
//C can be placed before D (500) and M (1000) to make 400 and 900. 
//Given a roman numeral, convert it to an integer.

public class Challenge3 {

	public static void main(String[] args) {

		System.out.println("This is my third challenge");

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter a Roman number : ");
		String input = reader.next();

		System.out.println("Input is ::" + input);

		int output = 0, value = 0, previous_val = 0;
		char previous = '.';
		for (char c : input.toCharArray()) {
			System.out.println(c);
			switch (c) {
			case 'I':
				value = 1;
				break;
			case 'V':
				value = 5;
				break;
			case 'X':
				value = 10;
				break;
			case 'L':
				value = 50;
				break;
			case 'C':
				value = 100;
				break;
			case 'D':
				value = 500;
				break;
			case 'M':
				value = 1000;
				break;
			}

			output += value;
			
			if ( (previous_val == 0) || (previous_val >= value) )
				;
			else
				output -= 2*previous_val;
			previous_val = value;
			
//			// This still has issue
//			if (("VXLCDM".lastIndexOf(c) >= 00) && (previous == 'I'))
//				output -= 2;
			previous = c;

		}

		System.out.println("Number is " + output);

	}

}
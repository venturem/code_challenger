package com.challenger.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
// 
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

public class Challenge4 {

	public static void main(String[] args) {

		System.out.println("This is my fourth challenge");

//		Scanner reader = new Scanner(System.in);
//
//		System.out.println("Enter a Roman number : ");
//		String input = reader.next();
		char[] pattern_arr = {}, match_pattern_arr = new char[20];
		int matching_pattern_length = 0;
		
//		String[] strs = { "flower", "flow", "flight" };
		
		String[] strs = {"dog","racecar","car"};

		System.out.println("Input is ::" + strs.toString());

		String pattern = "";
		int minlength = strs[0].length();
		pattern_arr = strs[0].toCharArray();

		for (String str : strs) {
			if (minlength > str.length()) {
				minlength = str.length();

				pattern_arr = str.toCharArray();
				System.out.println("Pattern is " + String.valueOf(pattern_arr));
			}
		}

		boolean broken = false;
		System.out.println("Min Length is " + minlength);
		System.out.println("Pattern is " + String.valueOf(pattern_arr));

		for (String str : strs) {
			for (int i = 0; i < minlength; i++) {
				System.out.println(str.charAt(i));
				if (str.charAt(i) != pattern_arr[i]) {
					broken = true;
					matching_pattern_length = i;
					match_pattern_arr[i] = '\0';
					break;
				}
				match_pattern_arr[i] = pattern_arr[i];
			}
			if (broken)
				break;
		}

		System.out.println("Matching pattern is " + String.valueOf(match_pattern_arr).substring(0, matching_pattern_length));
	}

}
package com.challenger.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//

public class Challenge1 {

	public static void main(String[] args) {
		System.out.println("This is my first challenge");
		
		int[] input1 = {1,2,3,4,5};
		int sum = 6;

		for (int i = 0 ; i < input1.length; i++)
		{
			int outer_sum = sum - input1[i];
			for (int j = i+1 ; j < input1.length ; j++)
			{
				int inner_sum = outer_sum - input1[j];
				
				if ( inner_sum == 0) 
					System.out.println("Index of input array is Array[" + i + "]->" + input1[i] +""+" + Array[" + j+ "]->" + input1[j] + "");
			}
		}

		//System.out.println("You entered : |" + "" + "|");
		
		
	}


}
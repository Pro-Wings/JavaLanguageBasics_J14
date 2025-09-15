package com.prowings.corejava.loops;

import java.util.Scanner;

public class ForEx2 {
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		//5. Print sum of numbers from 1 to 50
		
		int sumOfNumbers = 0;
		
		for(int i=1; i<=50; i++)
		{
			sumOfNumbers = sumOfNumbers + i;
		}
		
		System.out.println("Sum of 1 to 50 Numbers is : " +sumOfNumbers);
		
		System.out.println("main method ended!!");
	}

}

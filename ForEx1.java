package com.prowings.corejava.loops;

import java.util.Scanner;

public class ForEx1 {
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		System.out.println("Please enter the number for Multiplication Table :");
		
		Scanner scanner = new Scanner(System.in);
		
		int givenNumber = scanner.nextInt();
		
		System.out.println("You have entered : "+givenNumber);
		
		System.out.println("Below is the Table : ");
		
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(givenNumber*i);
		}
		
		System.out.println("main method ended!!");
	}

}

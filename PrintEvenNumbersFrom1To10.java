package com.prowings.corejava.loops;

public class PrintEvenNumbersFrom1To10 {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		for(int i=1; i<=10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even Number :"+i);
			}
		}
		
		System.out.println("main ended!!");
		
	}

}

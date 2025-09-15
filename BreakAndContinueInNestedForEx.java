package com.prowings.corejava.loops;

public class BreakAndContinueInNestedForEx {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		
		outerFor: for(int i=1; i<=5; i++)
		{
			System.out.println("i = "+i);
			
			for(int j=1; j<=3; j++)
			{
				if(j == 2)
					break outerFor;
				System.out.println("j = "+j);
			}
			
		}
		
		System.out.println("main method ended!!");
	}

}

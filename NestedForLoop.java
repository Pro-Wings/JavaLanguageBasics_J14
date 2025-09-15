package com.prowings.corejava.loops;

public class NestedForLoop {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		for(int i=1; i<=3; i++)
		{
			
			for(int j=1; j<=5; j++)
			{
				System.out.println(i +" : " + j);
			}
			
		}
		
		System.out.println("main method ended!!");
	}

}

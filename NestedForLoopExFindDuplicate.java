package com.prowings.corejava.loops;

public class NestedForLoopExFindDuplicate {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		int[] numbers = {10,20,10,30,40,20,50};
		
		//find duplicates from given array
		
		for(int i=0; i<7; i++)
		{
			for(int j = i+1; j<7; j++)
			{
				if(numbers[i] == numbers[j])
				{
					System.out.println("Duplicate Element found!!  -- "+numbers[i]);
				}
			}
			
		}
		
		
		System.out.println("main method ended!!");
	}

}

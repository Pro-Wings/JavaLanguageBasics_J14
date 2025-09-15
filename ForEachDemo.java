package com.prowings.corejava.loops;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main mehtod started!!");
		
		int[] numbers = {10,3,2,5,6,7};
		
		System.out.println("Array Length = "+numbers.length);
		
//		for(int i=numbers.length-1; i>=0; i--)
//		{
//			System.out.println(numbers[i]);
//		}

		for(int i=0; i<numbers.length; i+=2)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("===============================");
		
		for(int x : numbers)
		{
			if(x%2==0)
				System.out.println(x);
		}
		
		System.out.println("main mehtod ended!!");
		
	}

}

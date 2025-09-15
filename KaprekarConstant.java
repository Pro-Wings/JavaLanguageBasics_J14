package com.prowings.corejava.loops;

import java.util.Arrays;
import java.util.Scanner;

public class KaprekarConstant {
	// Function to perform one step of Kaprekar routine
	private static int kaprekarStep(int num) {
		// Convert number to 4-digit string (with leading zeros if needed)
		String s = String.format("%04d", num);

		// Convert string to array of digits
		char[] digits = s.toCharArray();

		// Sort digits in ascending order
		Arrays.sort(digits);
		String smallStr = new String(digits); // smallest number

		// Reverse to get largest number
		String largeStr = new StringBuilder(smallStr).reverse().toString();

		int small = Integer.parseInt(smallStr);
		int large = Integer.parseInt(largeStr);

		return large - small;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 4-digit number (at least 2 different digits): ");
		int num = sc.nextInt();

		if (num < 1000 || num > 9999) {
			System.out.println("Please enter a valid 4-digit number!");
			return;
		}

		int count = 0;
		while (num != 6174) {
			int next = kaprekarStep(num);
			System.out.printf("Step %d: %04d -> %d\n", ++count, num, next);
			num = next;

			if (num == 0) { // Case like 1111
				System.out.println("All digits are same. Process will not reach 6174.");
				return;
			}
		}
		System.out.println("Reached Kaprekar's Constant 6174 in " + count + " steps!");
	}
}
package com.jys.practice.easy;

/**
 * Convert Roman to Integer ranging 1 to 3999 (this can be anything under 5000) 
 * Using switch statement to convert
 * characters. Two for loops, O(n) run time.
 * 
 * Roman Numeral Key -
 * M = 1000
 * CM = 900
 * D = 500
 * CD = 400
 * C = 100
 * XC = 90
 * L = 50
 * XL = 40
 * X = 10
 * IX = 9
 * V = 5
 * IV = 4
 * I = 1
 *
 */
public class RomanToInteger {
	public int converToInt(String romanNumeral) {
		int nums[] = new int[romanNumeral.length()];
		for (int i = 0; i < romanNumeral.length(); i++) {
			// i could also use an if statement here
			switch (romanNumeral.charAt(i)) {
			case 'M':
				nums[i] = 1000;
				break;
			case 'D':
				nums[i] = 500;
				break;
			case 'C':
				nums[i] = 100;
				break;
			case 'L':
				nums[i] = 50;
				break;
			case 'X':
				nums[i] = 10;
				break;
			case 'V':
				nums[i] = 5;
				break;
			case 'I':
				nums[i] = 1;
				break;
			}
		}
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1])
				sum -= nums[i];
			else
				sum += nums[i];
		}
		return sum + nums[nums.length - 1];
	}

}

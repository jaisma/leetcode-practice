package com.jys.practice.easy;

/**
 * check half of the number to avoid overflow. 
 * compare it with reversed input.
 * if equals return true.
 *
 */
public class PalindromeNumber {
	public boolean checkPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0)) {
			return false;
		}

		int reverse = 0;
		while (x > reverse) {
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}
		return (x == reverse || x == reverse / 10);
	}

}

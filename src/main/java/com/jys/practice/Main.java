package com.jys.practice;

import com.jys.practice.easy.PalindromeNumber;
import com.jys.practice.easy.ReverseInteger;
import com.jys.practice.easy.TwoSum;

public class Main {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] twoSumTest = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] twoSumResult = twoSum.findTwoSum(twoSumTest, 11);
		System.out.printf("%d + %d = 11\n", twoSumResult[0], twoSumResult[1]);

		ReverseInteger reverseInteger = new ReverseInteger();
		int reverseIntegerTest = 43215678;
		int reverseIntegerResult = reverseInteger.reverseInt(reverseIntegerTest);
		System.out.printf("%d reversed = %d \n", reverseIntegerTest, reverseIntegerResult);

		PalindromeNumber palindromeNumber = new PalindromeNumber();
		int palindromeNumberTest = 1234321;
		boolean palindromeNumberResult = palindromeNumber.checkPalindrome(palindromeNumberTest);
		System.out.printf("%d is palindrome: %b", palindromeNumberTest, palindromeNumberResult);
	}
}

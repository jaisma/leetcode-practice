package com.jys.practice;

import com.jys.practice.medium.SpiralMatrix;

public class Main {

	public static void main(String[] args) {
		
		SpiralMatrix spiralMatrix = new SpiralMatrix(); 
		int[][] matrix = { { 1, 2, 3, 0}, { 4, 5, 6, 0 }, { 7, 8, 9, 0 }, { 10, 11, 12, 0 } };
		System.out.println(spiralMatrix.spiralOrder(matrix));
		System.out.println(spiralMatrix.spiralOrderCounter(matrix));
		
//		
//		CountPrimes countPrimes = new CountPrimes();
//		int countPrimesResult = countPrimes.countPrimes(60);
//		int test = countPrimes.countPrimesBruteForce(60);
//		System.out.println(countPrimesResult);
//		System.out.println(test);
//		System.out.println(countPrimes.isPrime(2));
//		
//		TwoSum twoSum = new TwoSum();
//		int[] twoSumTest = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
//		int[] twoSumResult = twoSum.findTwoSum(twoSumTest, 11);
//		System.out.printf("%d + %d = 11\n", twoSumResult[0], twoSumResult[1]);
//		
//		MaxDifference maxDiff = new MaxDifference();
//		int arr[] = {23, 55, 67, 22, 40, 65, 44, 20};
//        int size = arr.length;
//        System.out.println(maxDiff.findMaxDifference(arr));
//        System.out.println(maxDiff.maxDiffSmallBeforeLargeAfter(arr, size));
//        
//        MaxKSum maxKSum = new MaxKSum();
//        int[] maxKSumTest = new int[] { 31, 24, 1, 0, 2, 12, 1, 24, 3, 4, 5, 9, 6, 3, 7, 8 };
//        int maxKResult = maxKSum.getMaxSum(maxKSumTest, 4);
//        // 31 + 24 + 24 + 12 = 91
//        System.out.println(maxKResult);
//		
//		ReverseInteger reverseInteger = new ReverseInteger();
//		int reverseIntegerTest = 43215678;
//		int reverseIntegerResult = reverseInteger.reverseInt(reverseIntegerTest);
//		System.out.printf("%d reversed = %d \n", reverseIntegerTest, reverseIntegerResult);
//
//		PalindromeNumber palindromeNumber = new PalindromeNumber();
//		int palindromeNumberTest = 1234321;
//		boolean palindromeNumberResult = palindromeNumber.checkPalindrome(palindromeNumberTest);
//		System.out.printf("%d is palindrome: %b\n", palindromeNumberTest, palindromeNumberResult);
//		
//		RomanToInteger romanToInteger = new RomanToInteger();
//		String romanNumeralTest = "MMMDLXXXIX";
//		int romanToIntegerResult = romanToInteger.converToInt(romanNumeralTest);
//		System.out.printf("%s in integer is: %d\n", romanNumeralTest, romanToIntegerResult);
//		
//		LongestSubstringWORepeatingChar lsworc = new LongestSubstringWORepeatingChar();
//		String lsworcTest = "vabvpcvfgvhevuwvjevksvnrvihvtivbfvhjvxavehvofvwg";
//		int lsworcResult = lsworc.lengthOfLongestSubstring(lsworcTest);
//		System.out.printf("Longest string length: %d\n", lsworcResult);
	}
}

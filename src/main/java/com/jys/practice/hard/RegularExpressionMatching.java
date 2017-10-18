package com.jys.practice.hard;

public class RegularExpressionMatching {

	/**
	 * '.' Matches any single character. 
	 * '*' Matches zero or more of the preceding element.
	 * 
	 * The matching should cover the entire input string (not partial).
	 * 
	 * The function prototype should be: bool isMatch(const char *s, const char *p)
	 * 
	 * Some examples: 
	 * isMatch("aa","a") → false 
	 * isMatch("aa","aa") → true
	 * isMatch("aaa","aa") → false 
	 * isMatch("aa", "a*") → true 
	 * isMatch("aa", ".*") → true 
	 * isMatch("ab", ".*") → true 
	 * isMatch("aab", "c*a*b") → true
	 * 
	 */
	public boolean isMatchRecursive(String text, String pattern) {
		if (pattern.isEmpty())
			return text.isEmpty();
		boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

		if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
			return (isMatchRecursive(text, pattern.substring(2))
					|| (first_match && isMatchRecursive(text.substring(1), pattern)));
		} else {
			return first_match && isMatchRecursive(text.substring(1), pattern.substring(1));
		}

	}

	public int count = 0;

	public boolean isMatch(String text, String pattern) {
		count++;
		System.out.println();
		System.out.println("Current Text: " + text);
		System.out.println("Current Pattern: " + pattern);

		// if I run out of pattern, then I check if text is empty.
		if (pattern.isEmpty()) {
			System.out.println("Pattern is empty. checking to see if text is empty: " + text.isEmpty());
			return text.isEmpty();
		}

		boolean match = (!text.isEmpty() && (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.'));

		System.out.println("Match is: " + match);

		if (pattern.length() > 1 && pattern.charAt(1) == '*') {
			System.out.println("In the IF. Text: " + text);
			System.out.println("In the IF. Pattern: " + pattern);

			return (isMatch(text, pattern.substring(2)) || (match && isMatch(text.substring(1), pattern)));

		} else {
			System.out.println("In the ELSE. Text: " + text);
			System.out.println("In the ELSE. Pattern: " + pattern);

			return match && isMatch(text.substring(1), pattern.substring(1));
		}

	}

	public boolean isMatchDP(String text, String pattern) {
		boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
		dp[text.length()][pattern.length()] = true;

		for (int i = text.length(); i >= 0; i--) {
			for (int j = pattern.length() - 1; j >= 0; j--) {
				boolean first_match = (i < text.length()
						&& (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));
				if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
					dp[i][j] = dp[i][j + 2] || first_match && dp[i + 1][j];
				} else {
					dp[i][j] = first_match && dp[i + 1][j + 1];
				}
			}
		}
		return dp[0][0];
	}

}

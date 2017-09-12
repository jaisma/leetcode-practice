package com.jys.practice.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Map with unique characters as keys and index as values.
 * Keep two pointers which define the max substring. 
 * Move the right pointer to scan through the string,
 * update the map while iterating. 
 * 
 * If the character is already in the map, then move the left pointer to the right
 * of the same character last found. 
 * 
 * Note that the two pointers can only move forward.
 * 
 * Assume good input.
 * 
 */
public class LongestSubstringWORepeatingChar {

	public int lengthOfLongestSubstring(String s) {
		if (s.length() <= 1) {
			return s.length();
		}

		Map<Character, Integer> map = new HashMap<>();
		int max = 0;
		for (int i = 0, j = 0; i < s.length(); ++i) {
			if (map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
		}
		return max;
	}

}

package com.jys.practice.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find maximum sum of 'k' largest element in an int array.
 * 
 * Storing unique int in the array and number of time they are present.
 * Iterate input array once = O(n)
 * Iterate unique integers once = O(r) where 'r' = number of unique int
 * Iterate count of each unique integers once = O(c) where 'c' = number of each unique element.
 * 
 * Not completely sure but runtime = O(n + r^c)
 * If 'r' and 'c' can be considered constant then O(n)
 * 
 */
public class MaxKSum {

	public int getMaxSum(int[] arr, int k) {

		if (k == 0 || k > arr.length) {
			return 0;
		}

		Map<Integer, Integer> intRange = new HashMap<>();
		// go through input array, populate map which has count of each unique input
		for (int i : arr) {
			if (intRange.containsKey(i)) {
				intRange.replace(i, intRange.get(i) + 1);
			} else {
				intRange.put(i, 1);
			}
		}

		List<Integer> elements = new ArrayList<>(intRange.keySet()); // already sorted l -> h

		int sum = 0;
		int count = k;

		for (int i = elements.size() - 1; i > 0; --i) {
			int elementCount = intRange.get(elements.get(i));
			for (int j = 0; j < elementCount; ++j) {
				if (count == 0) {
					return sum;
				}
				count--;
				sum += elements.get(i);
			}
		}

		return sum;
	}

	/**
	 * going to try to implement using count sort
	 * 
	 */
	public int getMaxSumSort(int[] arr, int k) {
		
		return 0;
	}
}

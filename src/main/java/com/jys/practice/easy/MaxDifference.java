package com.jys.practice.medium;

/**
 * Given int array, find max difference between any two elements.
 * 
 */
public class MaxDifference {

	public int findMaxDifference(int[] arr) {
		int maxDiff = 0;
		
		if (arr.length < 2) {
			return maxDiff;
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}
		
		maxDiff = Math.abs(max - min);
		return maxDiff;
	}
	
	public int maxDiffSmallBeforeLargeAfter(int arr[], int arr_size) 
    {
        int max_diff = 0;
        int min_element = arr[0];
        for (int i = 0; i < arr.length; ++i) 
        {
            if (arr[i] - min_element > max_diff) {
                max_diff = arr[i] - min_element;
            }
            if (arr[i] < min_element) {
                min_element = arr[i];
            }
        }
        return max_diff;
    }
}

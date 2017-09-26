package com.jys.practice.medium;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 *
 */
public class MaxAreaBar {

	/**
	 * Check every combination iteratively. O(n^2)
	 * 
	 * @param height
	 * @return
	 */
	public int maxAreaBruteForce(int[] height) {
		int maxarea = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
			}
		}
		return maxarea;
	}

	/**
	 * Two pointers, one from front and back, closing in to middle. The shorter /
	 * smaller of the two pointer moves.
	 * 
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int maxarea = 0, l = 0, r = height.length - 1;
		while (l < r) {
			int temp = maxarea;
			maxarea = Math.max(Math.min(height[l], height[r]) * (r - l), maxarea); //max function keeps the left param if equal
			if (maxarea != temp || maxarea == temp) {
				System.out.printf(
						"currently, index %d with height %d and\n"
						+ "index %d with height %d will give\n"
						+ "max area of %d\n", l,
						height[l], r, height[r], maxarea); // if we want to keep track of indexes
			}
			if (height[l] < height[r]) {
				l++;
			} else { //if they are equal the right pointer moves.
				r--;
			}
		}
		return maxarea;
	}

}

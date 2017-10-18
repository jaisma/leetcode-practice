package com.jys.practice.easy;

public class SearchRotatedArray {

	/**
	 * return index
	 * 
	 * @param arr
	 * @param target
	 * @return index of target. -1 if not found
	 */
	public int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;

			// if current is target
			if (arr[mid] == target) {
				return mid;
			}

			// 4, 5, 6, 7, 1, 2, 3; find 5
			// if start is less or equal to current
			if (arr[start] <= arr[mid]) { // 4 < 7?
				// if target is between start and current
				if (target >= arr[start] && target < arr[mid]) {
					// then i know it is on my left partition
					end = mid - 1;
				} else {
					// if not then it is on the right partition
					start = mid + 1;
				}

			}
			// if end is greater or equal to current
			if (arr[end] >= arr[mid]) {
				// if target is between current and end
				if (target >= arr[mid] && target < arr[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}

			}

		}

		return -1;
	}

}

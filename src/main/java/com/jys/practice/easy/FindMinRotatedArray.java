package com.jys.practice.easy;

public class FindMinRotatedArray {

	public int findMin(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;
			System.out.println(mid);

			// 4, 5, 1, 2, 3
			// if the number before is greater than current, then i know current is min since sorted.
			if (mid > 0 && arr[mid - 1] > arr[mid]) {
				return arr[mid];
			}

			// 5, 6, 7, 8, 9, 1, 2, 3, 4
			// if start and end are both less than mid, then i know the min is on my right partition
			if (arr[start] <= arr[mid] && arr[end] < arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return arr[start];
	}
}

package com.jys.practice.medium;

public class JumpGame {

	/**
	 * Brute force way, where every possible jump is checked at every jump.
	 * 
	 * @param arr
	 * @return
	 */
	public boolean canJumpBruteForce(int[] arr) {

		return canJumpBruteForceHelper(arr, 0);
	}

	/**
	 * Recursive method taking current position and its value to see if end can be
	 * reached.
	 * 
	 * @param arr
	 * @param position
	 * @return true if possible, false otherwise
	 */
	public boolean canJumpBruteForceHelper(int[] arr, int position) {
		if (position == arr.length - 1) {
			return true;
		}

		int furthestJump = Math.min(position + arr[position], arr.length - 1);

		// Checking from the end to the current position.
		// Also possible to check from current position to the end
		for (int i = furthestJump; i > position; --i) {
			if (canJumpBruteForceHelper(arr, i)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Ideal solution - from the end, find a single solution that works. constantly
	 * update the "last position" to the very first "good" position.
	 * 
	 * @param arr
	 * @return
	 */
	public boolean canJump(int[] arr) {
		int lastPos = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; --i) {
			if (i + arr[i] >= lastPos) {
				//System.out.printf("Is current index: %d + value: %d greater than or equal to last good position: %d ?\n", i, arr[i], lastPos);
				lastPos = i;
				//System.out.println("Yes, updating last good position to: " + lastPos);
			} else {
//				System.out.printf("Current index: %d + value: %d is smaller than last good position: %d ?\n", i, arr[i], lastPos);
			}
		}
		return lastPos == 0;
	}

}

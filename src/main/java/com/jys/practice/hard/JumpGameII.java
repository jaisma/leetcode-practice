package com.jys.practice.hard;

import com.jys.practice.medium.JumpGame;

/**
 * Same as jump game but shortest possible moves. I guess input array guarantees
 * a finish. But I'm just going to call the JumpGame class to make sure it is
 * possible to finish.
 *
 */
public class JumpGameII {

	public int shortestJump(int[] arr) {
		JumpGame validate = new JumpGame();
		if (!validate.canJump(arr) || arr.length < 2) {
			return -1;
		}
		
		int totalJumps = 0;
		int currentEnd = 0;
		int currentFarthest = arr[0];

		for (int i = 0; i < arr.length - 1; ++i) {
			System.out.println("current index: " + i + ", value of: " + arr[i]);
			
			int temp = currentFarthest;
			currentFarthest = Math.max(currentFarthest, i + arr[i]);
			
			if(currentFarthest >= arr.length -1) { 
				return totalJumps + 1; 
			}
			
			if (temp != currentFarthest) {
				System.out.println("current index: " + i + " updating fardest to: " + currentFarthest);
			}
			
			if (i == currentEnd) {
				++totalJumps;
				currentEnd = currentFarthest;
			}
		}
		return totalJumps;
	}
}

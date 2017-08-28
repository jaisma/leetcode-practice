package com.jys.practice.easy;

/**
 * using mod 10 to grab least significant digit. 
 * divide by 10 to reduce places.
 * repeat until 0.
 * 
 * @author js044486
 *
 */
public class ReverseInteger {

	public int reverseInt(int x) {
		int result = 0;

		while (x != 0) {
			int tail = x % 10;
			int newResult = result * 10 + tail;
			if ((newResult - tail) / 10 != result) {
				return 0;
			}
			result = newResult;
			x = x / 10;
		}

		return result;
	}

}

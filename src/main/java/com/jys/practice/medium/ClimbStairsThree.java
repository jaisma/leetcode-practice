package com.jys.practice.medium;

public class ClimbStairsThree {

	public int count(int n) {

		if (n < 3)
			return n;

		int first = 1;
		int second = 2;
		int third = 4;

		for (int i = 3; i < n; ++i) {
			int current;
			current = first + second + third;
			first = second;
			second = third;
			third = current;
		}

		return third;
	}
}

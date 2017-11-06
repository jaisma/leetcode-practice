package com.jys.practice.medium;

public class RandomWeightedIndex {

	public int getRandomWeightedIndex(float[] weights) {

		double random = Math.random();
		System.out.println("random = " + random);
		float lower = 0f;
		float upper = 0f;
		for (int i = 0; i < weights.length; ++i) {
			if (i != 0) {
				upper = weights[i] + weights[i - 1];
			} else {
				upper = 0f;
			}
			System.out.println("temp = " + lower + " checking with " + upper);
			if (lower <= random && random <= upper) {
				System.out.println("Got it");
				return i;
			}
			lower += weights[i];

		}
		return weights.length - 1;
	}
}

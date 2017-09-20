package com.jys.practice.easy;

public class CountPrimes {

	public int countPrimes(int n) {
		if (n < 3) {
			return 0;
		}

		boolean[] f = new boolean[n];
		int count = n / 2;

		for (int i = 3; i * i < n; i += 2) { // check if prime
			if (f[i]) { // i'th index set to non prime by next for loop. skip
				continue;
			}

			for (int j = i * i; j < n; j += 2 * i) { // i dont understand this. why 2 * i?
				if (!f[j]) {
					--count;
					f[j] = true;
				}
			}
		}
		return count;
	}

	public int countPrimesBruteForce(int n) {
		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * only have to go up to the square root of n, because listing out all of the
	 * factors of a number, the square root will always be in the middle. int takes
	 * floor.
	 * 
	 * traverse odd numbers up to the square root of n.
	 * 
	 * @param n
	 * @return true if prime number
	 */
	public boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

package com.jys.practice.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array arr of distinct integers and a nonnegative integer k, write a
 * function findPairsWithGivenDifference that returns an array of all pairs
 * [x,y] in arr, such that x - y = k. If no such pairs exist, return an empty
 * array.
 * 
 * In your solution, try to reduce the memory usage while maintaining time
 * efficiency. Prove the correctness of your solution and analyze its time and
 * space complexities.
 * 
 * Note: the order of the pairs in the output array doesn’t matter.
 * 
 * Examples:
 * input: arr = [0, -1, -2, 2, 1], k = 1
 * output: [[0, -1], [-1, -2], [2, 1], [1, 0]]
 * 
 * input: arr = [1, 7, 5, 3, 32, 17, 12], k = 17 
 * output: [] 
 * 
 * Constraints:
 * [time limit] 5000ms
 * [input] array.integer arr
 * 		0 ≤ arr.length ≤ 100 
 * [input]integer k
 * 		k ≥ 0 
 * [output] array.array.integer
 *
 */
public class FindAllPairs {
	
	/**
	 * Time Complexity: the most expensive step in the algorithm is sorting the
	 * array, which takes O(N⋅log(N)) time. The while loop is O(N) since every
	 * iteration increments one of the counters by one (thus the maximal number of
	 * iterations is 2N). So the total time complexity is O(N⋅log(N)) + O(N) =
	 * O(N·log(N)).
	 * 
	 * Space Complexity: since the size of the output itself is O(N), the space
	 * complexity is O(N) as well. However, excluding the output, notice that we
	 * used only O(1) space since the sorting is in place and we only initialize two
	 * pointers.
	 * 
	 */
	public int[][] findPairsWithGivenDifferenceII() {
		//TODO: FINISH
		return null;
	}
	
	/**
	 * Time Complexity: O(n) iter through once
	 * 
	 * Space Complexity: O(n) using hashmap
	 * 
	 */
	public int[][] findPairsWithGivenDifference(int[] arr, int k) {
		//TODO: FINISH
		Map<Integer, Integer> ref = new HashMap<>();
		int[][] answer = new int[(arr.length + 1) / 2][2];
		int countOfAnswers = 0;
		for (int i = 0; i < arr.length; ++i) {
			int comp = arr[i] - k;

			if (ref.containsKey(comp)) {
				// grab the current number and the compliment
				// add to the answer
				answer[countOfAnswers][0] = ref.get(comp);
				answer[countOfAnswers][1] = arr[i];
				countOfAnswers++;
			} else {
				ref.put(arr[i], i);

			}
		}

		for (int i = 0; i < answer.length; ++i) {
			for (Integer j : answer[i]) {
				System.out.print(j + " ");
			}
		}
		System.out.println(Arrays.toString(answer));

		return null;
	}

}

/**
 * Pseudocode:
 * function findPairsWithGivenDifference(arr, k):
    arr.sort()
    answer = []
    first = 0
    last = 1

    while (last < arr.length AND first < arr.length):
        if (first != last AND arr[last] - arr[first] == k):
            answer.push( [arr[last], arr[first]] )
            first++
            last++
        else if(arr[last] - arr[first] < k):
            last++
        else:
            first++

    return answer
*/
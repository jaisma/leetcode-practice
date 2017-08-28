package com.jys.practice.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * create map storing complements. 
 * use it as a look up while iterating. 
 * add to map if it doesn't exist. 
 * return if complement exists.
 * 
 * @author js044486
 *
 */
public class TwoSum {

	public int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> complements = new HashMap<>();
		for (int i = 0; i < nums.length; ++i) {
			int complement = target - nums[i];
			if (complements.containsKey(complement)) {
				return new int[] { complements.get(complement), i };
			}
			complements.put(nums[i], i);
		}

		return new int[0];
	}

}

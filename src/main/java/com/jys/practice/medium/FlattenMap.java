package com.jys.practice.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a dictionary dict, write a function flattenDictionary that returns a
 * flattened version of it .
 * 
 * If you’re using a compiled language such Java, C++, C#, Swift and Go, you may
 * want to use a Map/Dictionary/Hash Table that maps strings (keys) to a generic
 * type (e.g. Object in Java, AnyObject in Swift etc.) to allow nested
 * dictionaries.
 * 
 * Example:
 * 
 * input: 
 * dict = { 	"Key1" : "1", 
 * 			"Key2" : { 
 * 				"a" : "2", 
 * 				"b" : "3", 
 * 				"c" : { 
 * 					"d" : "3", 
 * 					"e" : "1" } 
 * 			} 
 * 		  }
 * 
 * output: 
 * {	"Key1" : "1", 
 * 	"Key2.a" : "2", 
 * 	"Key2.b" : "3", 
 * 	"Key2.c.d" : "3",
 * 	"Key2.c.e" : "1" } 
 * 
 * Important: 
 * when you concatenate keys, make sure to add the dot character between them. 
 * For instance concatenating Key2, c and d the result key would be Key2.c.d.
 * 
 * Constraints:
 * [time limit] 5000ms 
 * [input] Dictionary dict 
 * [output] Dictionary
 * 
 *
 */
public class FlattenMap {

	/**
	 * Time Complexity: O(N), where N is the number of keys in the input dictionary.
	 * We visit every key in dictionary only once, hence the linear time complexity.
	 * Space Complexity: O(N) since the output dictionary is asymptotically as big
	 * as the input dictionary. We also store recursive calls in the execution stack
	 * which in the worst case scenario could be O(N), as well. The total is still
	 * O(N).
	 * 
	 * @param dict
	 * @return flattened map
	 */
	public Map<String, String> flattenDictionary(Map<String, Object> dict) {
		Map<String, String> res = new HashMap<>();
		helper("", dict, res);
		return res;
	}

	public void helper(String carryKey, Map<String, Object> dict, Map<String, String> res) {
		dict.forEach((k, v) -> {
			if (v instanceof String || v instanceof Integer) {
				if (carryKey == null || carryKey.equals("")) {
					res.put(k, v.toString());
				} else if (k.equals("")) {
					res.put(carryKey, v.toString());
				} else {
					res.put(carryKey + "." + k, v.toString());
				}
			} else {
				@SuppressWarnings("unchecked")
				Map<String, Object> map = (Map<String, Object>) dict.get(k);
				if (carryKey == null || carryKey.equals(""))
					helper(k, map, res);
				else
					helper(carryKey + "." + k, map, res);
			}
		});
	}

}
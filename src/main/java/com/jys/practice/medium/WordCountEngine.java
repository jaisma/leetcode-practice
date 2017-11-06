package com.jys.practice.medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implement a document scanning function wordCountEngine, which receives a
 * string document and returns a list of all unique words in it and their number
 * of occurrences, sorted by the number of occurrences in a descending order,
 * then by the order of tokens in the sentence. Assume that all letters are in
 * english alphabet. You function should be case-insensitive, so for instance,
 * the words “Perfect” and “perfect” should be considered the same word.
 * 
 * The engine should strip out punctuation (even in the middle of a word) and
 * use whitespaces to separate words.
 * 
 * Analyze the time and space complexities of your solution. Try to optimize for
 * time while keeping a polynomial space complexity.
 *
 * Example: 
 * input: document = "Practice makes perfect. you'll only get Perfect
 * 						by practice. just practice!" 
 * 
 * output: 	[ 	["practice", "3"], ["perfect", "2"], ["makes", "1"], 
 * 				["get", "1"], ["by", "1"], ["just", "1"],
 * 				["youll", "1"], ["only", "1"] ]
 * 
 * Important: 
 * please convert the occurrence integers in the output list to
 * strings (e.g. "3" instead of 3). We ask this because in compiled languages
 * such as C#, Java, C++, C etc., it’s not straightforward to create mixed-type
 * arrays (as it is, for instance, in scripted languages like JavaScript,
 * Python, Ruby etc.). The expected output will simply be an array of string
 * arrays.
 * 
 * Constraints: 
 * [time limit] 5000ms [input] string document [output]
 * array.array.string
 *
 */
public class WordCountEngine {

	public String[][] wordCountEngine(String document) {
		
		document = "Wow Practice makes perfect. you'll only\n"
				+ "                    get Wow Perfect by practice. just practice hee!\"";

		Map<String, Integer> count = new HashMap<>();
		String[] words = document.toLowerCase().replaceAll("[$&+,:;=?@#|'<>.^*()%!-]", "").split("\\b");

		for (String s : words) {
			if (s.matches("\\w+")) {
				if (count.containsKey(s)) {
					count.replace(s, count.get(s) + 1);
				} else {
					count.put(s, 1);
				}
			}
		}

		Map<Integer, List<String>> sorted = new HashMap<>();
		Collection<Integer> values = count.values();
		values.forEach(x -> {
			if (!sorted.containsKey(x)) {
				sorted.put(x, new ArrayList<>());
			}
		});

		count.forEach((k, v) -> {
			List<String> temp = sorted.get(v);
			temp.add(k);
			sorted.replace(v, temp);
		});

		//TODO:
		// i need to figure out how to return it in str[][]
//		String[][] result = new String[count.size()][2];
//		Integer ci = count.size();
//		sorted.forEach((k, v) -> {
//			for (String s : v) {
//				String[] temp = { s, k.toString() };
//				result[ci--] = temp;
//				System.out.println(Arrays.toString(temp));
//			}
			// System.out.println("Key: " + k + " Value: " + v);
//		});
		return null;
	}
	
	public String[][] wordCountEngineAnswer(String document) {
		
		// switch to lower case
		// remove special characters 
		// split by white space
		String[] words = document.toLowerCase().replaceAll("[$&+,:;=?@#|'<>.^*()%!-]", "").split("\\b");
		
		// calculate occurrences
		// generate map key = word, value = occurrences 
		// increment value if key exists
		// create new entry if no key found
		// keep max count of occurrences for later sort use
		Map<String, Integer> occurrences = new HashMap<>();
		int largestCount = 0;
		for (String s : words) {
			if (s.matches("\\w+")) { // one ore more word character
				if (occurrences.containsKey(s)) {
					largestCount = Math.max(largestCount, occurrences.get(s) + 1); // update max count
					occurrences.replace(s, occurrences.get(s) + 1);
				} else {
					occurrences.put(s, 1);
				}
			}
		}
		
		return null;
		
	}

	// public String[][] wordCountEnginePsudo(String document) {
	//
	// wordMap = new Map()
	// wordList = document.split()
	// largestCount = 0;
	//
	// for i from 0 to wordList.length-1:
	// # convert each token to lowercase
	// word = wordList[i].toLowerCase()
	//
	// # and remove special/punctuation characters
	// charArray = []
	// for ch in word:
	// if (ch >= 'a' and ch <= 'z'):
	// charArray.push(ch)
	//
	// # form a string from the characters in charArray.
	// # use your programming language's native “join”
	// # or equivalent function. If there isn't any,
	// # implement yourself. It's quite straightforward.
	// cleanWord = join(charArray)
	//
	// # if the token consisted of only whitespace
	// # characters, then cleanWord is an empty string
	// # and we should ignore it and continue to the
	// # next word.
	// if (cleanWord.length < 1):
	// continue
	//
	// # add clean word to the wordMap and
	// # increase counter if needed
	// count = 0
	// if (cleanWord in wordMap):
	// count = wordMap[cleanWord]
	// count++
	// else:
	// count = 1
	//
	// if (count > largestCount):
	// largestCount = count
	//
	// wordMap[cleanWord] = count
	//
	// # init the word counter list of lists.
	// # Since, in the worst case scenario, the
	// # number of lists is going to be as
	// # big as the maximum occurrence count,
	// # we need counterList's size to be the
	// # same to be able to store these lists.
	// # Creating counterList will allow us to
	// # “bucket-sort” the list by word occurrences
	// counterList = new Array(largestCount+1)
	// for j from 0 to largestCount:
	// counterList[j] = null
	//
	// # add all words to a list indexed by the
	// # corresponding occurrence number.
	// for word in wordMap.keys():
	// counter = wordMap[word]
	// wordCounterList = counterList[counter]
	//
	// if (wordCounterList == null):
	// wordCounterList = []
	//
	// wordCounterList.push(word)
	// counterList[counter] = wordCounterList
	//
	// # iterate through the list in reverse order
	// # and add only non-null values to result
	// result = []
	// for l from counterList.length-1 to 0:
	// wordCounterList = counterList[l]
	// if (wordCounterList == null):
	// continue
	//
	// stringifiedOccurrenceVal = toString(l)
	// for m from 0 to wordCounterList.length-1:
	// result.push([wordCounterList[m], stringifiedOccurrenceVal])
	//
	// return result
	// }

}

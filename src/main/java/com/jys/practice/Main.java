package com.jys.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

import com.jys.practice.easy.MaxDepthBinaryTree.TreeNode;
import com.jys.practice.medium.RandomWeightedIndex;

public class Main {
	
	public static class WaterNode {
		public int val;
		public WaterNode[] children;
		
		public WaterNode(int val) {
			this.val = val;
			this.children = new WaterNode[0];
		}
		
		public WaterNode() {
			
		}
	}

	public static void setValue(int input) {
		input++;
	}
	
	public static void setValue(String input) {
		
		input = "Def";
	}
	
	public static void main(String[] args) {
		
		RandomWeightedIndex randomWeightedIndex = new RandomWeightedIndex();
		float[] weights = new float[] { 0.1f, 0.2f, 0.3f, 0.4f };
		randomWeightedIndex.getRandomWeightedIndex(weights);
		
//		
//		String first = "A String";
//		
//		String second = "A" + " " + "String";
//		
//
//		List<Integer> test = new ArrayList<>();
//		
//		
//		System.out.println(first == second);
//		System.out.println(first.equals(second));

//		MaxWaterTime mwt = new MaxWaterTime();
//		WaterNode k = new WaterNode(1);
//		WaterNode j = new WaterNode(1);
//		WaterNode i = new WaterNode(1);
//		WaterNode h = new WaterNode(1);
//		WaterNode g = new WaterNode(1);
//		WaterNode f = new WaterNode(2);
//		WaterNode e = new WaterNode(0);
//		WaterNode d = new WaterNode(2);
//		WaterNode c = new WaterNode(3);
//		WaterNode b = new WaterNode(3);
//		WaterNode a = new WaterNode(3);
//
//		a.children = new WaterNode[] { b, c };
//		b.children = new WaterNode[] { d, e, f };
//		c.children = new WaterNode[] { g, h };
//		d.children = new WaterNode[] {i, j};
//		i.children = new WaterNode[] {k};
//		
//		int test = mwt.maxTime(a);
//		System.out.println("DID I GET IT!?!?  " + test);

		// 1k
		// 1i, 1j
		// 2d, 		0e, 2f 		1g, 1h
		// 3b 					3c
		// 3a
		
		// ClimbStairsThree cst = new ClimbStairsThree();
		// System.out.println(cst.count(4));
 
		Map<String, Integer> testMap = new HashMap<>();
		
		Map<String, Integer> testMapII = new TreeMap<>();
		
		List<String> testList = new ArrayList<>();
		List<String> testListII = new LinkedList<>();
		
		Queue<Integer> testQueue = new PriorityQueue<>();
		Queue<Integer> testQueueII = new LinkedList<>();
		
		
		
//		String[] testString = {"aaaaaaaaaaaabbbbbbcdee"};
//		groupAnagrams(testString);
		
		
		// int[][] data = {{1487799425, 14, 1},
		// {1487799425, 4, 0},
		// {1487799425, 2, 0},
		// {1487800378, 10, 1},
		// {1487801478, 18, 0},
		// {1487801478, 18, 1},
		// {1487901013, 1, 0},
		// {1487901211, 7, 1},
		// {1487901211, 7, 0} };
		//
		//
		// FlattenMap flatMap = new FlattenMap();
		// Map<String, Object> dict = new HashMap<>();
		// Map<String, Object> key2 = new HashMap<>();
		// Map<String, Object> c = new HashMap<>();
		//
		//
		//
		// dict.put("Key1", "1");
		// dict.put("Key2", key2);
		// key2.put("a", "2");
		// key2.put("b", "3");
		// key2.put("c", c);
		// c.put("d", "3");
		// c.put("e", "1");
		//
		// Map<String, String> result = flatMap.flattenDictionary(dict);
		//
		// result.forEach((k,v) -> {
		// System.out.println("Key: " + k + " Value: " + v);
		// });

	}
	
	public static int maxDepth(TreeNode root) {
	    if(root == null) {
	        return 0;
	    }
	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.offer(root);
	    int count = 0;
	    while(!queue.isEmpty()) {
	        int size = queue.size();
	        int maxVal = 0;
	        while(size-- > 0) {
	            TreeNode node = queue.poll();
	            maxVal = Math.max(maxVal, node.val);
	        }
	        //queue.addAll(children);
	        count++;
	    }
	    return count;
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0)
			return new ArrayList();
		Map<String, List> ans = new HashMap<String, List>();
		int[] count = new int[26];
		for (String s : strs) {
			Arrays.fill(count, 0);
			for (char c : s.toCharArray())
				count[c - 'a']++;

			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < 26; i++) {
				sb.append('#');
				sb.append(count[i]);
			}
			String key = sb.toString();
			System.out.println(key);
			if (!ans.containsKey(key))
				ans.put(key, new ArrayList<>());
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}

}

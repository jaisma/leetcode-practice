package com.jys.practice.medium;

import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	/**
	 * Given an arr of sorted array that may have been rotated, find if target int exists.
	 * 
	 * Brute force: start from 0th index, iterate through the list to find the target.
	 * 
	 * Algo: Modified binary search. keep track of 
	 * 

	 * @param arr rotated array
	 * @param target
	 * @return -1 if not found. index number if found.
	 */
	public int searchInRotatedBinary(int[] arr, int target) {
		
		
		Stack<Node> stack = new Stack<>();
		Queue<Node> queue;
		Node root = new Node();
		
		return -1;
	}

	class Node {
		public int data;
		public Node left, right;

		Node() {
			
		}
		Node(int item) {
			data = item;
			left = right;
		}
	}

}

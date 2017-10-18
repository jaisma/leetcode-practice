package com.jys.practice.medium;

public class LinkedListOverlap {
	/**
	 * O(n) time and space complexity - using a hash table and storing nodes
	 * 
	 * to reduce space complexity, we can check node to every other node which is
	 * O(n^2)
	 * 
	 * To do this O(n) and no space of O(1), we first compute the length, and the
	 * difference in length, and iterate together until the same. we first need to
	 * check if they end at the same node as well.
	 * 
	 */
	public ListNode<Integer> getOverlap(ListNode<Integer> l1, ListNode<Integer> l2) {
		int len1 = 0;
		int len2 = 0;

		ListNode<Integer> first = l1;
		ListNode<Integer> second = l2;

		while (first != null) {
			++len1;
			first = first.next;
		}

		while (second != null) {
			++len2;
			second = second.next;
		}

		int diff = Math.abs(len1 - len2);

		if (len1 > len2) {
			first = l1;
			while (diff-- > 0) {
				first = first.next;
			}
		} else {
			second = l2;
			while (diff-- > 0) {
				second = second.next;
			}
		}

		while (first != second && (first.next != null || second.next != null)) {
			first = first.next;
			second = second.next;
		}

		return first;
	}
	
	public void overlappingWithCycle() {
		
	}
	
	

	public class ListNode<T> {
		public T val;
		public ListNode<T> next;

		public ListNode(T val) {
			this.val = val;
		}

		public ListNode(T val, ListNode<T> next) {
			this.val = val;
			this.next = next;
		}
	}

}

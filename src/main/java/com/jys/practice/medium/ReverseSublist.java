package com.jys.practice.medium;

public class ReverseSublist {
	
	/**
	 * 1, 2, 3, 4, 5, 6, 7, 8, 9
	 * from 3rd to 8th
	 * 
	 * 1, 2, 4, 3, 5, 6, 7, 8, 9
	 * 1, 2, 5, 4, 3, 6 ,7, 8, 9
	 * 1, 2, 6, 5, 4, 3, 7, 8, 9
	 * 1, 2, 7, 6, 5, 4, 3, 8, 9
	 * 1, 2, 8, 7, 6, 5, 4, 3, 9
	 * 
	 * @param L
	 * @param start
	 * @param finish
	 * @return
	 */
	public ListNode<Integer> reverseSubList(ListNode<Integer> L, int start, int finish) {
		
		ListNode<Integer> sentinel = new ListNode<>(-1, L);
		ListNode<Integer> sublistHead = sentinel;
		
		int k = 1;
		while (k++ < start) {
			sublistHead = sublistHead.next;
		}
		
		ListNode<Integer> sublistIter = sublistHead.next;
		while (start++ < finish) {
			ListNode<Integer> temp = sublistIter.next;
			sublistIter.next = temp.next;
			temp.next = sublistHead.next;
			sublistHead.next = temp;
		}
		
		return sentinel.next;
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

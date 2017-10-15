package com.jys.practice.easy;

public class MergeTwoSortedLists {

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

	public class ListNodeDouble<T> {
		public T val;
		public ListNodeDouble<T> prev;
		public ListNodeDouble<T> next;

		public ListNodeDouble(T val) {
			this.val = val;
		}

		public ListNodeDouble(T val, ListNodeDouble<T> prev, ListNodeDouble<T> next) {
			this.val = val;
			this.prev = prev;
			this.next = next;
		}
	}

	/**
	 * Time complexity = O(n + m) Space complexity = O(1)
	 * 
	 */
	public ListNode<Integer> merge(ListNode<Integer> l1, ListNode<Integer> l2) {

		ListNode<Integer> sentinel = new ListNode<>(0, null);
		ListNode<Integer> current = sentinel;
		ListNode<Integer> first = l1;
		ListNode<Integer> second = l2;

		while (first != null && second != null) {
			if (first.val <= second.val) {
				current.next = first;
				first = first.next;
			} else {
				current.next = second;
				second = second.next;
			}
			current = current.next;
		}

		current.next = first != null ? first : second;

		return sentinel.next;
	}

	/**
	 * Time complexity = O(n + m) Space complexity = ?
	 */
	public ListNode<Integer> mergeI(ListNode<Integer> l1, ListNode<Integer> l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeI(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeI(l1, l2.next);
			return l2;
		}

	}

	/**
	 * how to do it when doubly linked
	 * Time complexity = O(nlog(n))
	 */
	public ListNodeDouble<Integer> mergeDoubleLinked(ListNodeDouble<Integer> l1, ListNodeDouble<Integer> l2) {

		// If first linked list is empty
		if (l1 == null) {
			return l2;
		}

		// If second linked list is empty
		if (l2 == null) {
			return l1;
		}

		// Pick the smaller value
		if (l1.val < l2.val) {
			l1.next = mergeDoubleLinked(l1.next, l2);
			l1.next.prev = l1;
			l1.prev = null;
			return l1;
		} else {
			l2.next = mergeDoubleLinked(l1, l2.next);
			l2.next.prev = l2;
			l2.prev = null;
			return l2;
		}
	}

}

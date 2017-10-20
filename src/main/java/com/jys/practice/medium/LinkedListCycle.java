package com.jys.practice.medium;

public class LinkedListCycle {

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

	public ListNode<Integer> hasCycle(ListNode<Integer> head) {
		ListNode<Integer> sentinel = new ListNode<>(-1);

		return null;
	}

}

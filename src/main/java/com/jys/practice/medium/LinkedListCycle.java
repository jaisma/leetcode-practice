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

		ListNode<Integer> slow = head;
		ListNode<Integer> fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			// found cycle
			if (slow == fast) {
				int cycleLength = 0;
				do {
					++cycleLength;
					fast = fast.next;
				} while (slow != fast);

				ListNode<Integer> cycleLenIter = head;
				while (cycleLength-- > 0) {
					cycleLenIter = cycleLenIter.next;
				}

				ListNode<Integer> iter = head;
				while (iter != cycleLenIter) {
					iter = iter.next;
					cycleLenIter = cycleLenIter.next;
				}
				return iter;

			}
		}
		return null;
	}

	public ListNode<Integer> hasCycleTest(ListNode<Integer> head) {
		
		ListNode<Integer> slow = head;
		ListNode<Integer> fast = head;
		
		while (slow != null && fast != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				
				int cycleLength = 0;
				
				do {
					fast = fast.next;
					cycleLength++;
					
				} while (slow != fast);
			}
			
		}
		
		return null;
		
		
	}


}

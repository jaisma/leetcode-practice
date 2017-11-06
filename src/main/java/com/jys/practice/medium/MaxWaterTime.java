package com.jys.practice.medium;

import java.util.LinkedList;
import java.util.Queue;

import com.jys.practice.Main.WaterNode;

public class MaxWaterTime {

//	public class WaterNode {
//		public int val;
//		public WaterNode[] children;
//		
//		public WaterNode(int val) {
//			this.val = val;
//			this.children = null;
//		}
//		
//		public WaterNode() {
//			
//		}
//	}

	public int maxTime(WaterNode root) {

		Queue<WaterNode> queue = new LinkedList<>();
		Queue<Integer> next = new LinkedList<>();
		queue.offer(root);
		next.offer(root.val);
		int max = 0;
		while (!queue.isEmpty()) {
			WaterNode current = queue.poll();
			int currentVal = next.poll();

			for (WaterNode n : current.children) {
				queue.offer(n);
				next.offer(currentVal + n.val);
				max = Math.max(max, currentVal + n.val);
			}

		}
		return max;
	}

}
// 2d, 0e, 2f 		1g, 1h
// 3b 			3c
// 3a

/**
 *
 *  q[3] v[3]
 *  q[] v[] currentVal = 3 
 *  q[3,3] v[6, 6] max = 3
 *  q[3] v[6] currentVal = 6
 *  q[3, 2, 0, 2] v[6, 8, 6, 8] max = 8
 *  q[2, 0, 2, 1, 1] v[8, 6, 8, 7, 7] max = 8
 *  q[0, 2, 1, 1] v[6, 8, 7, 7] currentVal = 8
 *  q[2, 1, 1] v[8, 7, 7] currentVal = 6
 *  q[1, 1] v[7, 7] currentVal = 8
 *  q[1] v[7] currentVal = 7
 *  q[] v[] currentVal = 7
 */

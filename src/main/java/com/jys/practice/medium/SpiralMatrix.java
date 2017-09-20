package com.jys.practice.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * Given:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * 
 * return [1,2,3,6,9,8,7,4,5]
 *
 */
public class SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> answer = new ArrayList<>();

		if (matrix.length == 0) {
			return answer;
		}

		int rowLength = matrix.length;
		int colLength = matrix[0].length;
		boolean[][] checked = new boolean[rowLength][colLength]; // default set everything to false

		// the directions is set clockwise. counter clockwise would be:
		// row { 1, 0, -1, 0 }
		// column { 0, 1, 0, -1 }
		int[] rowDirection = { 0, 1, 0, -1 }; // stay(right), down, stay(left), up
		int[] colDirection = { 1, 0, -1, 0 }; // right, stay(down), left, stay(up)
		int currentRow = 0;
		int currentCol = 0;
		int currentDirection = 0; // used in row and column

		for (int i = 0; i < rowLength * colLength; ++i) {
			answer.add(matrix[currentRow][currentCol]);
			checked[currentRow][currentCol] = true;
			int nextRow = currentRow + rowDirection[currentDirection];
			int nextCol = currentCol + colDirection[currentDirection];

			if (0 <= nextRow && nextRow < rowLength && // nextRow isn't very top (-1) or bottom (n+1)
				0 <= nextCol && nextCol < colLength && // next column isn't very left (-1) or right (n+1)
				!checked[nextRow][nextCol]) { // and it hasn't been checked yet (false)

				currentRow = nextRow;
				currentCol = nextCol;
			} else {
				currentDirection = (currentDirection + 1) % 4;
				currentRow += rowDirection[currentDirection];
				currentCol += colDirection[currentDirection];
			}
		}
		return answer;
	}
	
	public List<Integer> spiralOrderCounter(int[][] matrix) {
		List<Integer> answer = new ArrayList<>();

		if (matrix.length == 0) {
			return answer;
		}

		int rowLength = matrix.length;
		int colLength = matrix[0].length;
		boolean[][] checked = new boolean[rowLength][colLength]; // default set everything to false

		int[] rowDirection = { 1, 0, -1, 0 };
		int[] colDirection = { 0, 1, 0, -1 };
		int currentRow = 0;
		int currentCol = 0;
		int currentDirection = 0; // used in row and column

		for (int i = 0; i < rowLength * colLength; ++i) {
			answer.add(matrix[currentRow][currentCol]);
			checked[currentRow][currentCol] = true;
			int nextRow = currentRow + rowDirection[currentDirection];
			int nextCol = currentCol + colDirection[currentDirection];

			if (0 <= nextRow && nextRow < rowLength && // nextRow isn't very top (-1) or bottom (n+1)
				0 <= nextCol && nextCol < colLength && // next column isn't very left (-1) or right (n+1)
				!checked[nextRow][nextCol]) { // and it hasn't been checked yet (false)

				currentRow = nextRow;
				currentCol = nextCol;
			} else {
				currentDirection = (currentDirection + 1) % 4;
				currentRow += rowDirection[currentDirection];
				currentCol += colDirection[currentDirection];
			}
		}
		return answer;
	}
	
}

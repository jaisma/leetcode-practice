package com.jys.practice.hard;

/**
 * Given a dictionary, a method to do lookup in dictionary and a M x N board
 * where every cell has one character.
 * 
 * Find all possible words that can be formed by a sequence of adjacent
 * characters. Can move to any of 8 adjacent characters, but a word should not
 * have multiple instances of same cell.
 * 
 * 
 * Input:
 * dictionary[] = {"GEEKS", "FOR", "QUIZ", "GO"};
 *      boggle[][]   = {{'G','I','Z'},
 *                      {'U','E','K'},
 *                      {'Q','S','E'}};
 *     isWord(str): returns true if str is present in dictionary
 *                  else false.
 * 
 * Output:
 * Following words of dictionary are present
 *        GEEKS
 *        QUIZ
 * 
 * 
 */
public class BoggleII {
	
	public boolean isValidWord(String word, String[] dictionary) {
		for (String s : dictionary) {
			if (word.equals(s)) {
				return true;
			}
		}
		return false;
	}

	public String findWords(char[][] board, String[] dictionary) {
		
		int boardWidth = board[0].length;
		int boardHeight = board.length;
		
		boolean[][] visited = new boolean[boardWidth][boardHeight]; //default should be set to false
		
		String word = "";
		
//		for (int i=0; i<M; i++)
//		       for (int j=0; j<N; j++)
//		             findWordsUtil(boggle, visited, i, j, str);
//		}
		
		
		
		return "";
	}
	
//	// A recursive function to print all words present on boggle
//	void findWordsUtil(char boggle[M][N], bool visited[M][N], int i,
//	                   int j, string &str)
//	{
//	    // Mark current cell as visited and append current character
//	    // to str
//	    visited[i][j] = true;
//	    str = str + boggle[i][j];
//	 
//	    // If str is present in dictionary, then print it
//	    if (isWord(str))
//	        cout << str << endl;
//	 
//	    // Traverse 8 adjacent cells of boggle[i][j]
//	    for (int row=i-1; row<=i+1 && row<M; row++)
//	      for (int col=j-1; col<=j+1 && col<N; col++)
//	        if (row>=0 && col>=0 && !visited[row][col])
//	          findWordsUtil(boggle,visited, row, col, str);
//	 
//	    // Erase current character from string and mark visited
//	    // of current cell as false
//	    str.erase(str.length()-1);
//	    visited[i][j] = false;
//	}

}

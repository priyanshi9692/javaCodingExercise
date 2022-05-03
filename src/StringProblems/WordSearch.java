package StringProblems;
/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally
or vertically neighboring.
 The same letter cell may not be used more than once.

 Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
 */
public class WordSearch {

    public static boolean wordSearch(char[][] board, String word){

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(wordFound(board, word, i, j,0)){

                    return true;
                }
            }
        }
        return false;
    }

    public static boolean wordFound(char[][] board, String word, int i, int j, int k){
        int rowL = board.length;
        int colL = board[0].length;

        if(i<0 || j<0 || i>=rowL || j>=colL){
            return false;
        }
        if(board[i][j] == word.charAt(k)){
            char temp = board[i][j];
            board[i][j] = '#';

            if(k == word.length()-1){

                return true;
            }
            else if(wordFound(board, word, i+1, j, k+1)
            || wordFound(board, word, i-1, j, k+1)
            || wordFound(board, word, i, j+1, k+1)
            || wordFound(board, word, i, j-1, k+1)){

                return true;
            }
            board[i][j] = temp;
        }
        return false;
    }



    public static void main(String[] args){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};

        String word = "ABCCED";

        System.out.println(wordSearch(board, word));
    }
}

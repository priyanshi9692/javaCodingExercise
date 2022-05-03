package Neetcode.Backtracking;

public class WordSearch {
    public static boolean wordExists(char[][] board, String word){
        if(board.length == 0 || board == null){
            return false;
        }

        int rows = board.length-1;
        int cols = board[0].length-1;

        for(int i = 0; i<=rows;  i++){
            for(int j = 0; j<=cols; j++){
                if(isExists(board, i,j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isExists(char[][] board, int i, int j, String word, int k){
        // base condition

        if(i<0 || i>=board.length || j<0 || j>=board[0].length){
            return false;
        }

        if(board[i][j] == word.charAt(k)){
            char temp = board[i][j];
            board[i][j] = '#';

            if(k == word.length()-1){
                return true;
            }else if(isExists(board, i+1, j, word, k+1)
                    || isExists(board, i-1, j, word, k+1)
                    || isExists(board, i, j+1, word, k+1)
                    || isExists(board, i, j-1, word, k+1)){
                return true;
            }
            board[i][j] = temp;
        }
        return false;
    }
    public static void main(String[] args){
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        System.out.println("Word exists: "+ wordExists(board, "ABCCED"));
    }
}

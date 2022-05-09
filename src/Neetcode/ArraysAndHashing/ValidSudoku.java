    package Neetcode.ArraysAndHashing;

    import java.util.HashSet;

    public class ValidSudoku {
        public static boolean validSudoku(char[][] board){
            HashSet<Integer> [] rows = new HashSet[9];
            HashSet<Integer>[] cols = new HashSet[9];
            HashSet<Integer>[] boxes = new HashSet[9];

            for(int i =0; i<9; i++){
                rows[i] = new HashSet<>();
                cols[i] = new HashSet<>();
                boxes[i] = new HashSet<>();
            }

            for(int i = 0; i<9; i++){
                for(int j = 0; j<9; j++){
                    char num = board[i][j];
                    if(num!= '.'){
                        int n = (int) num;
                        int boxIndex = (i/3)*3+j/3;

                        if(!rows[i].add(n) || !cols[j].add(n) || !boxes[boxIndex].add(n)){
                            return false;
                        }
                    }

                }
            }
            return true;
        }

        public static void main(String[] args){
            char[][] board = {
                    {'5','3','.','.','7','.','.','.','.'},
                    {'6','.','.','1','9','5','.','.','.'},
                    {'.','9','8','.','.','.','.','6','.'},
                    {'8','.','.','.','6','.','.','.','3'},
                    {'4','.','.','8','.','3','.','.','1'},
                    {'7','.','.','.','2','.','.','.','6'},
                    {'.','6','.','.','.','.','2','8','.'},
                    {'.','.','.','4','1','9','.','.','5'},
                    {'.','.','.','.','8','.','.','7','9'}
            };
            System.out.println("Valid Sudoku: "+ validSudoku(board));
        }
    }

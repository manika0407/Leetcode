package BackTracking;

/**
 * Created by manika on 7/31/17.
 Write a program to solve a Sudoku puzzle by filling the empty cells.

 Empty cells are indicated by the character '.'.

 You may assume that there will be only one unique solution.


 */
public class sudokuSolver {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;
        solve(board);
    }
    private boolean solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char ch='1'; ch<='9'; ch++){
                        if(isValid(board, i, j, ch)){
                            board[i][j]=ch;

                            if(solve(board)){
                                return true;
                            }
                            else {
                                board[i][j] = '.';
                            }
                            }
                            return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int row, int col, char ch){
        for(int i=0;i<9;i++){
            if(board[i][col]!='.' && board[i][col]==ch) return false;
            if(board[row][i]!='.' && board[row][i]==ch) return false;
            if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == ch) return false;
        }
        return true;
    }
}

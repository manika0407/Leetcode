package BackTracking;

/**
 * Created by manika on 7/31/17.
 * Given a 2D board and a word, find if the word exists in the grid.

 The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

 For example,
 Given board =

 [
 ['A','B','C','E'],
 ['S','F','C','S'],
 ['A','D','E','E']
 ]
 word = "ABCCED", -> returns true,
 word = "SEE", -> returns true,
 word = "ABCB", -> returns false.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(helper(board, word, i, j,0))
                    return true;
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int i, int j, int idx) {
        if(idx==word.length())
            return true;
        if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1)
            return false;
        if(board[i][j]-word.charAt(idx)!=0)
            return false;
        char record= board[i][j];
        board[i][j]='*';
        boolean res=helper(board, word, i+1, j, idx+1) || helper(board, word, i-1, j, idx+1) || helper(board, word, i, j+1, idx+1) || helper(board, word, i, j-1, idx+1);
        board[i][j]=record;
        return res;
    }

    public static void main(String[] args) {
        char[][] board={{'A', 'B', 'C','E'},{'S','F', 'C', 'S'}, {'A', 'D','E','E'}};
        System.out.println(new WordSearch().exist(board, "ABCCED"));
    }

}


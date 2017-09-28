package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 */
public class wordSearch2 {
    public List<String> findWords(char[][] board, String[] words){
        List<String> allWords=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            if(allWords.contains(words[i])) continue;
            if(exist(board, words[i]))
                allWords.add(words[i]);
        }
        return allWords;
    }
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
//        char[][] board={{'A', 'B', 'C','E'},{'S','F', 'C', 'S'}, {'A', 'D','E','E'}};
//        String[] words={"SEE", "ABCCED", "ABCB"};
        char[][] board={{'a'}};
        String[] words={"a", "a"};
        System.out.println(new wordSearch2().findWords(board, words));
    }
}

package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/30/17.
 */
public class generateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> solution = new ArrayList<String>();
        StringBuilder s=new StringBuilder("");
        backtrack(solution, s, 0, 0, n);
        return solution;
    }

    public void backtrack(List<String> list, StringBuilder str, int open, int close, int max){
        if(str.length()==2*max)
        {
            list.add(str.toString());
            return;
        }
        if(open<max){
            str=str.append("(");
            backtrack(list, str, open+1, close, max);
            str.deleteCharAt(str.length()-1);
        }
        if(close<open){
            str.append(")");
            backtrack(list, str, open, close+1, max);
            str.deleteCharAt(str.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new generateParentheses().generateParenthesis(2));
    }
}

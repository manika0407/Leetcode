package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 */
public class LetterCombination {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<String>();
        if(digits==null || digits.length()==0)
            return result;
        StringBuilder cur=new StringBuilder();
        String[][] map={{}, {}, {"a", "b", "c"}, {"d","e","f"}, {"g","h","i"}, {"j","k","l"},{"m","n","o"},{"p","q","r","s"}, {"t","u","v"}, {"w", "x", "y","z"}};
        helper(result, cur, digits,map, 0);
        return result;
    }

    private void helper(List<String> result, StringBuilder cur, String digits, String[][] map, int start) {
        if(start>=digits.length()) {
            result.add(cur.toString());
            return;
        }
        int index=digits.charAt(start)-'0';
        String[] current=map[index];
        for(int i=0;i<current.length;i++){
            cur=cur.append(current[i]);
            helper(result, cur, digits, map, start+1);
            cur.deleteCharAt(cur.length()-1);
        }
    }

    public static void main(String[] args) {
        String str="345";
        System.out.println(new LetterCombination().letterCombinations(str));
    }
}

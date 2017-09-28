package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manika on 7/31/17.
 * Given a string s, partition s such that every substring of the partition is a palindrome.

 Return all possible palindrome partitioning of s.

 For example, given s = "aab",
 Return

 [
 ["aa","b"],
 ["a","a","b"]
 ]
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> soln=new ArrayList<List<String>>();
        partition(soln, new ArrayList<String>(), s, 0);
        return soln;
    }

    private void partition(List<List<String>> soln, ArrayList<String> curString, String s, int start) {
        if(start==s.length())
            soln.add(new ArrayList<String>(curString));
        else{
            for(int i=start;i<=s.length();i++){
                if(isPalindrome(s, start, i)){
                    curString.add(s.substring(start, i+1));
                    partition(soln, curString, s, i+1);
                    curString.remove(curString.size()-1);
                }
            }
        }

    }

    private boolean isPalindrome(String s, int low, int high) {
        while(low < high)
            if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;
    }
}

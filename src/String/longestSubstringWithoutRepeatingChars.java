package String;

import java.util.HashSet;

/**
 * Created by manika on 7/11/17.
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 */
public class longestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int len=0;
        HashSet<Character> charSet=new HashSet<Character>();
        for(char c: s.toCharArray()){
            if(charSet.contains(c)){
                maxLen = Math.max(maxLen, charSet.size());
                len=0;
                charSet.clear();
                charSet.add(c);
                len++;
            }
            else{
             charSet.add(c);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abcabcbbghghghghghijkl";
        System.out.println(new longestSubstringWithoutRepeatingChars().lengthOfLongestSubstring(str));
    }
}

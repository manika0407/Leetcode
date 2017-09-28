package String;

import java.util.HashSet;

/**
 * Created by manika on 7/11/17.

 Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Note:
 Assume the length of given string will not exceed 1,010.

 Example:

 Input:
 "abccccdd"

 Output:
 7

 Explanation:
 One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class longestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> hs=new HashSet<Character>();
        int count=0;

        for(char c: s.toCharArray())
        {
          if(hs.contains(c))
          {
              count++;
            hs.remove(c);
          }
          else{
              hs.add(c);

          }
        }
        if(count==0) return 1;
        if(2*count==s.length())
            return 2*count;
        else
            return 2*count+1;

        }

    public static void main(String[] args) {
        String str="abcd";
        System.out.println(new longestPalindrome().longestPalindrome(str));
    }
}


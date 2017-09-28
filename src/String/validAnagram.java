package String;


/**
 * Created by manika on 4/21/17.
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.

 Follow up:
 What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s==null || t==null)
            return false;
       int[] count=new int[26];
       char[] aArr=s.toCharArray();
       char[] bArr=t.toCharArray();
        for (int i = 0; i < aArr.length; i++){
            count[aArr[i]-97]++;  // Increment the count of the character at respective position
            count[bArr[i]-97]--;  // Decrement the count of the character at respective position
        }
        for (int i = 0; i<26; i++){
            if (count[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "ab", t = "bb";
        System.out.println(isAnagram(s,t));
    }
}

package DynamicProgramming;

/**
 * Created by manika on 8/30/17.
 */
public class longestPalindromicSubstring {
    private int lo, maxLen;
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return s;

        for(int i=0;i<s.length()-1;i++){
            checkPalindrome(s, i, i); // to check for odd length palindromes
            checkPalindrome(s, i, i+1); //to check for even length palindromes

        }
        return s.substring(lo,lo+maxLen);
    }

    private void checkPalindrome(String s, int i, int j ) {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--; // to go towards the left side
            j++; // to go towards the right side
        }
        if(maxLen< j-i-1){
            lo=i+1;
            maxLen=j-i-1;
        }
    }

    public static void main(String[] args) {
        String  s="ababad";
        System.out.println(new longestPalindromicSubstring().longestPalindrome(s));
    }
}

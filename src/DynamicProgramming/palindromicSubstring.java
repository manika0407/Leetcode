package DynamicProgramming;

/**
 * Created by manika on 8/30/17.
 */
public class palindromicSubstring {
    int count=1;
    public int countSubstrings(String s) {
        if(s.length()==0)
            return 0;

        for(int i=0;i<s.length()-1;i++){
            checkPalindrome(s, i, i); // to check for odd length palindromes
            checkPalindrome(s, i, i+1); //to check for even length palindromes

        }
        return count;
    }

    private void checkPalindrome(String s, int i, int j ) {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--; // to go towards the left side
            j++; // to go towards the right side
        }
    }

    public static void main(String[] args) {
        String s="manam";
        System.out.println(new palindromicSubstring().countSubstrings(s));
    }
}

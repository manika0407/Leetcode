package DynamicProgramming;

/**
 * Created by manika on 7/28/17.
 */
public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
      if(s.length()==0) return true;
      int sIndex=0, tIndex=0;
      while(tIndex<t.length()){
          if(s.charAt(sIndex)==t.charAt(tIndex))
              sIndex++;
          if(sIndex==s.length()) return true;
          tIndex++;

      }
      return false;

    }

    public static void main(String[] args) {
        String str1="abcf";
        String str2="aebfcd";
        System.out.println(new isSubsequence().isSubsequence(str1,str2));
     //   System.out.println(new isSubsequence().isSubsequenceDP(str1,str2));
    }


}

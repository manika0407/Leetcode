package DynamicProgramming;

/**
 * Created by manika on 4/24/17.
 */
public class longestCommonSubstring {
    public int longestcommonsubstring(String m1,String m2){

        int[][] dp=new int[m1.length()][m2.length()];
        for(int i=0;i<m1.length();i++)
        {
            for(int j=0;j<m2.length();j++) {
                if (m1.charAt(i) == m2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }


                }
            }
        }

        int max=0;
        for(int i=0;i<m1.length();i++)
        {
            for(int j=0;j<m2.length();j++)
            {
                if(max<dp[i][j])
                    max=dp[i][j];
            }
        }
    return max;
    }

    public static void main(String[] args) {
        System.out.println(new longestCommonSubstring().longestcommonsubstring("mania","monia"));
    }
}

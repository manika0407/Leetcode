package DynamicProgramming;

/**
 * Created by manika on 4/16/17.
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        LongestCommonSubsequence lcs=new LongestCommonSubsequence();
        String str1="AEBCDGHLQR";
        String str2="AEDPHR";
        int result=lcs.lcsDynamic(str1,str2,str1.length(),str2.length());
        System.out.println(result);
    }

    private static int lcs(String str1,String str2,int m,int n)
    {
        if(m==0 || n==0)
            return 0;
        if(str1.charAt(m-1)==str2.charAt(n-1))
            return 1+ lcs(str1,str2,m-1,n-1);
        else
            return Math.max(lcs(str1,str2,m-1,n),lcs(str1,str2,m,n-1));
    }
    private static int lcsDynamic(String str1, String str2, int m, int n) {
        int[][] temp=new int[m+1][n+1];
        int max=0,i,j;
        for(i=0;i<=m;i++)
            temp[i][0]=0;
        for(j=0;j<=n;j++)
            temp[0][j]=0;
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    temp[i][j]=temp[i-1][j-1]+1;
                else
                    temp[i][j]=Math.max(temp[i-1][j],temp[i][j-1]);
            }
        }
        return temp[m][n];
    }
}

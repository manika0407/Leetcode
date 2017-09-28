package Bit_Manipulation;

/**
 * Created by manika on 8/30/17.
 */
public class countingBits {
    public int[] countBits(int num) {
        int[] dp=new int[num+1];
        dp[0]=0;
        int offset=1;
        for(int i=1;i<=num;i++){
            if(offset*2==i)
                offset*=2;
            dp[i]=dp[i-offset]+1;
        }
        return dp;
    }
}

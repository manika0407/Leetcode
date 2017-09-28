package DynamicProgramming;

/**
 * Created by manika on 4/23/17.
 */
public class longestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
    int len=nums.length;
    int[] dp=new int[len];
    for(int i=0;i<len;i++) dp[i]=1;
    for(int i=1;i<len;i++)
        for(int j=0;j<i;j++)
            if(nums[i]>nums[j] && dp[i]<dp[j]+1)
                dp[i]=dp[j]+1;

    int max=0;
    for(int i=0;i<len;i++)
    {
        if(max< dp[i])
             max=dp[i];
    }
    return max;
    }

    public static void main(String[] args) {
        int[] nums={16,1,3,5,0,20,25,46};
        System.out.println(new longestIncreasingSubsequence().lengthOfLIS(nums));
    }
}

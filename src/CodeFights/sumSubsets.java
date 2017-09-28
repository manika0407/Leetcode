package CodeFights;

/**
 * Created by manika on 4/23/17.
 */
public class sumSubsets {
    public static boolean hasSumSubset(int[] nums,int target){
        boolean dp[][]=new boolean[nums.length+1][target+1];
        for(int i=0;i<nums.length;i++)
            dp[i][0]=true;
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=target;j++){
                if(nums[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }
        return dp[nums.length][target];
    }
    public static boolean SubsetPartition(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        if(sum%2!=0) return false;
        sum=sum/2;
        boolean[][] dp=new boolean[nums.length+1][sum+1];
        for(int i=0;i<nums.length;i++)
            dp[i][0]=true;
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=sum;j++){
                if(nums[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }
        return dp[nums.length][sum];

    }

    public static void main(String[] args) {
        int[] nums={2,3,1,5};
        System.out.println(hasSumSubset(nums,19));
        System.out.println(SubsetPartition(nums));
    }
}

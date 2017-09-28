package Array;

/**
 * Leetcode
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * Created by manika on 4/10/17.
 */
public class maximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxEnding=Integer.MIN_VALUE,maxSoFar=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(maxEnding<0)
                maxEnding=nums[i];
            else
                maxEnding+=nums[i];
            if(maxEnding>maxSoFar) maxSoFar=maxEnding;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr={-2,-1};
        System.out.println(maxSubArray(arr));

    }
}

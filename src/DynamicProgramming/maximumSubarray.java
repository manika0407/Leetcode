package DynamicProgramming;

/**
 * Created by manika on 4/24/17.
 */
public class maximumSubarray {
    public int maxSubArray(int[] nums){
        int newSum=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            newSum=Math.max(newSum+nums[i],nums[i]);
            sum=Math.max(sum,newSum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] sum={3,-2,7,-1};
        System.out.println(new maximumSubarray().maxSubArray(sum));
    }
}

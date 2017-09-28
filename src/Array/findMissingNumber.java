package Array;

/**
 * Leetcode problem 268
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.

 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * Created by manika on 4/9/17.
 */
public class findMissingNumber {
    public static int missingNumber(int[] nums) {
        int i=0,xor=0;
        for(i=0;i<nums.length;i++)
        {
            xor=xor^i^nums[i];
        }
        return xor^nums.length;
    }

    public static void main(String[] args) {
        int nums[]={0,2,3};
        System.out.println(missingNumber(nums));
    }
}

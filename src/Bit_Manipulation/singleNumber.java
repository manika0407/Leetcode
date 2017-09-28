package Bit_Manipulation;

/**
 * Created by manika on 4/2/17.
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory.
 */
public class singleNumber {
    public static int singleNumber(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums={1,1,3,2,2};
        System.out.println(singleNumber(nums));
    }
}
